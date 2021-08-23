package com.ezticket.controller;


import com.ezticket.mapper.MovieMapper;
import com.ezticket.model.Movie;
import com.ezticket.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Movie> getMovieInfo(){
        return movieService.getAllMovieInfo();
    }

}
