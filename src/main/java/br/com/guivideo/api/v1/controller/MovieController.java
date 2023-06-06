package br.com.guivideo.api.v1.controller;

import br.com.guivideo.api.v1.dto.response.MovieResponse;
import br.com.guivideo.business.entity.Movie;
import br.com.guivideo.business.service.IMovieService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
    private final IMovieService movieService;
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<MovieResponse> registerMovie(@RequestParam("title") String title){
        MovieResponse movieResponse = movieService.registerMovie(title);
        return new ResponseEntity<>(movieResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Movie>> registerMovie(){
        List<Movie> movieResponse = movieService.findAll();
        return new ResponseEntity<>(movieResponse, HttpStatus.OK);
    }
}
