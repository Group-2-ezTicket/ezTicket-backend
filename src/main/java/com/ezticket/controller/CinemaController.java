package com.ezticket.controller;


import com.ezticket.dto.CinemaResponse;
import com.ezticket.mapper.CinemaMapper;
import com.ezticket.model.Cinema;
import com.ezticket.model.Movie;
import com.ezticket.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private CinemaMapper cinemaMapper;

    @GetMapping
    public List<Cinema> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }

    @GetMapping(path = "/{cinemaId}")
    public Cinema getCinemaById(@PathVariable Integer cinemaId){
        return cinemaService.getCinemaById(cinemaId);
    }

}
