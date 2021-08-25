package com.ezticket.dto;

import java.sql.Date;
import java.sql.Time;

public class ScheduleResponse {
    private Time timeStart;
    private Time timeEnd;

    public ScheduleResponse(Time timeStart, Time timeEnd) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public ScheduleResponse() {

    }

    public Time getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    public Time getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Time timeEnd) {
        this.timeEnd = timeEnd;
    }

}
