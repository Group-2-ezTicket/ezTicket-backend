package com.ezticket.dto;

import java.sql.Date;
import java.sql.Time;

public class ScheduleResponse {
    private Time timeStart;
    private Time timeEnd;
    private Date selectedDate;

    public ScheduleResponse(Time timeStart, Time timeEnd, Date selectedDate) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.selectedDate = selectedDate;
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

    public Date getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }
}
