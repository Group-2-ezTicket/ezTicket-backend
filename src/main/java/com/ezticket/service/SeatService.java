package com.ezticket.service;

import com.ezticket.model.Seat;
import com.ezticket.repository.ScheduleRepository;
import com.ezticket.repository.SeatRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatService {
    @Resource
    private SeatRepository seatRepository;

    public List<Seat> getAllSeats(){
        return seatRepository.findAll();
    }

    public List<Seat> getAllSeatsByScheduleId(int scheduleId){
        return seatRepository.findAll()
                .stream().filter(seat -> seat.getScheduleId() == scheduleId).collect(Collectors.toList());
    }
}
