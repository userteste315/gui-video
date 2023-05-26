package br.com.guivideo.business.service;

import br.com.guivideo.api.v1.dto.response.MovieResponse;

public interface IMovieService {
    public MovieResponse registerMovie(String title);
}
