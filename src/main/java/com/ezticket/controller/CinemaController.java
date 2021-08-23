package com.ezticket.controller;


import com.ezticket.dto.CinemaResponse;
import com.ezticket.mapper.CinemaMapper;
import com.ezticket.model.Cinema;
import com.ezticket.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    private final List<Cinema> cinemas = new ArrayList<>();
    @Autowired
    private CinemaService cinemaService;
    @Autowired
    private CinemaMapper cinemaMapper;

//    @GetMapping
//    public List<CinemaResponse> getAllCinemas() {
//        return cinemaMapper.toResponse(cinemaService.getAllCinemas());
//    }

    @GetMapping
    public List<Cinema> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }
}
