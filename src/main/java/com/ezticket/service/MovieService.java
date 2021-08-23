package com.ezticket.service;

import com.ezticket.dto.MovieResponse;
import com.ezticket.model.Movie;
import com.ezticket.repository.MovieRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MovieService {

    @Resource
    private MovieRepository movieRepository;

    public List<Movie> getAllMovieInfo() {
        return movieRepository.findAll();
    }
}
