package com.ezticket.mapper;

import com.ezticket.dto.CinemaResponse;
import com.ezticket.dto.MovieResponse;
import com.ezticket.model.Cinema;
import com.ezticket.model.Movie;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieMapper {
    public MovieResponse toResponse(Movie movie){
        MovieResponse movieResponse = new MovieResponse();
        BeanUtils.copyProperties(movie, movieResponse);
        movieResponse.setId(movie.getMovieId());
        return movieResponse;
    }

    public List<MovieResponse> toResponse(List<Movie> movie) {
        return movie.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

}
