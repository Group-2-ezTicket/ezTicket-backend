package com.ezticket.controller;


import com.ezticket.dto.MovieResponse;
import com.ezticket.mapper.MovieMapper;
import com.ezticket.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieMapper movieMapper;

    @GetMapping
    public List<MovieResponse> getMovieInfo() {
        return movieMapper.toResponse(movieService.getAllMovieInfo());
    }

    @GetMapping(path = "/{movieId}")
    public MovieResponse getMovieById(@PathVariable Integer movieId) {
        return movieMapper.toResponse(movieService.getMovieById(movieId));
    }


}
