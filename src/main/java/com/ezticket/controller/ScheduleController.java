package com.ezticket.controller;

import com.ezticket.dto.ScheduleResponse;
import com.ezticket.mapper.ScheduleMapper;
import com.ezticket.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private ScheduleMapper scheduleMapper;

    @GetMapping
    public List<ScheduleResponse> getAllSchedules(){
        return scheduleMapper.toResponse(scheduleService.getAllSchedules());
    }

}
