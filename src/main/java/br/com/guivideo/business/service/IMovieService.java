package br.com.guivideo.business.service;

import br.com.guivideo.api.v1.dto.response.MovieResponse;
import br.com.guivideo.business.entity.Movie;

import java.util.List;

public interface IMovieService {
    public MovieResponse registerMovie(String title);

    public List<Movie> findAll();
}
