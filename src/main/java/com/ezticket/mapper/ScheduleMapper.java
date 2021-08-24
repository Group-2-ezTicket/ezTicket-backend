package com.ezticket.mapper;

import com.ezticket.dto.ScheduleResponse;
import com.ezticket.model.Schedule;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ScheduleMapper {
    public ScheduleResponse toResponse(Schedule schedule){
        ScheduleResponse scheduleResponse = new ScheduleResponse();
        BeanUtils.copyProperties(schedule, scheduleResponse);
        return scheduleResponse;
    }

    public List<ScheduleResponse> toResponse(List<Schedule> schedule) {
        return schedule.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
