package com.ezticket.service;

import com.ezticket.model.Cinema;
import com.ezticket.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CinemaService {
    @Resource
    private CinemaRepository cinemaRepository;

    public List<Cinema> getAllCinemas(){
        return null;
    }
}
