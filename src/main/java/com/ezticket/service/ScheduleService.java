package com.ezticket.service;

import com.ezticket.model.Cinema;
import com.ezticket.model.Movie;
import com.ezticket.model.Schedule;
import com.ezticket.repository.CinemaRepository;
import com.ezticket.repository.MovieRepository;
import com.ezticket.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduleService {

    @Resource
    private ScheduleRepository scheduleRepository;

    @Resource
    private CinemaRepository cinemaRepository;

    @Resource
    private MovieRepository movieRepository;

    public List<Schedule> getAllSchedules(){
        return scheduleRepository.findAll();
    }

    public List<Schedule> getSchedulesByCinemaId(Integer cinemaId) {
        return scheduleRepository.findAll().stream().filter(schedule -> schedule.getCinemaId().equals(cinemaId)).collect(Collectors.toList());
    }

    public List<Schedule> getSchedulesByMovieId(Integer movieId) {
        return scheduleRepository.findAll().stream().filter(movie -> movie.getCinemaId().equals(movieId)).collect(Collectors.toList());
    }


    public List<Cinema> getAllCinemasShowingMovie(Integer movieId) {
        List<Integer> schedules = getSchedulesByMovieId(movieId).stream().map(schedule -> schedule.getCinemaId()).collect(Collectors.toList());
        return cinemaRepository.findAll().stream().filter(cinema -> schedules.contains(cinema.getCinemaId())).collect(Collectors.toList());
    }

    public List<Movie> getAllMoviesByCinemaId(Integer cinemaId) {
        List<Integer> schedules = getSchedulesByCinemaId(cinemaId).stream().map(schedule -> schedule.getMovieId()).collect(Collectors.toList());
        return movieRepository.findAll().stream().filter(movie -> schedules.contains(movie.getMovieId())).collect(Collectors.toList());
    }
}
