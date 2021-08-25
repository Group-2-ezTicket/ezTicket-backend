package com.ezticket.controller;

import com.ezticket.model.Seat;
import com.ezticket.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @GetMapping(path="/{movieId}")
    public List<Seat> getAllSeatsByScheduleId(){
        return seatService.getAllSeats();
    }
}
