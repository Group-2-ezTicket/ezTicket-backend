package com.ezticket.controller;

import com.ezticket.model.Seat;
import com.ezticket.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @GetMapping
    public List<Seat> getAllSeats(){
        return seatService.getAllSeats();
    }

    @GetMapping(params={"scheduleId"})
    public List<Seat> getAllSeatsByScheduleId(@RequestParam int scheduleId){
        return seatService.getAllSeatsByScheduleId(scheduleId);
    }
}
