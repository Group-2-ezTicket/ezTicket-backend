package com.ezticket.controller;

import com.ezticket.dto.ScheduleResponse;
import com.ezticket.mapper.ScheduleMapper;
import com.ezticket.model.Cinema;
import com.ezticket.model.Movie;
import com.ezticket.model.Schedule;
import com.ezticket.service.CinemaService;
import com.ezticket.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<ScheduleResponse> getAllSchedules(){
        return scheduleMapper.toResponse(scheduleService.getAllSchedules());
    }

    @GetMapping(params = {"cinemaId"})
    public List<Schedule> getAllSchedulesByCinemaId(@RequestParam Integer cinemaId){
        return scheduleService.getSchedulesByCinemaId(cinemaId);
    }

    @GetMapping(params = {"movieId"})
    public List<Schedule> getAllSchedulesByMovieId(@RequestParam Integer movieId){
        return scheduleService.getSchedulesByMovieId(movieId);
    }

    @GetMapping(path = "/cinemas",params = {"movieId"})
    public List<Cinema> getCinemasByMovieId(@RequestParam Integer movieId) {
        return scheduleService.getAllCinemasShowingMovie(movieId);
    }

    @GetMapping(path = "/movies",params = {"cinemaId"})
    public List<Movie> getMoviesByCinemaId(@RequestParam Integer cinemaId) {
        return scheduleService.getAllMoviesByCinemaId(cinemaId);
    }



}
