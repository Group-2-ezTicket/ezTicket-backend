package com.ezticket.service;

import com.ezticket.model.Schedule;
import com.ezticket.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScheduleService {

    @Resource
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedules(){
        return scheduleRepository.findAll();
    }
}
