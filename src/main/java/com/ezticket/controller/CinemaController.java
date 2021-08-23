package com.ezticket.controller;


import com.ezticket.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    private final List<Cinema> cinemas = new ArrayList<>();
    @Autowired
    private CinemaController cinemaController;
}
