package br.com.guivideo.business.service.impl;

import br.com.guivideo.api.v1.dto.response.MovieResponse;
import br.com.guivideo.business.entity.Movie;
import br.com.guivideo.business.service.IMovieService;
import br.com.guivideo.infrastructure.repository.MovieRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    private final MovieRepository movieRepository;
    private final ModelMapper modelMapper;

    public MovieService(MovieRepository movieRepository, ModelMapper modelMapper) {
        this.movieRepository = movieRepository;
        this.modelMapper = modelMapper;
    }

    public MovieResponse registerMovie(String title) {
        Movie newMovie = new Movie(title);
        movieRepository.save(newMovie);
        return modelMapper.map(newMovie, MovieResponse.class);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

}
