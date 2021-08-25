package com.ezticket.service;

import com.ezticket.model.Seat;
import com.ezticket.repository.SeatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SeatService {
    @Resource
    private SeatRepository seatRepository;

    public List<Seat> getAllSeats(){
        return seatRepository.findAll();
    }
}
