package com.ezticket.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SCHEDULEID")
    private Integer scheduleId;
    @Column(name="MOVIEID")
    private Integer movieId;
    @Column(name="TIMESTART")
    private Time timeStart;
    @Column(name="TIMEEND")
    private Time timeEnd;
    @Column(name="SELECTEDDATE")
    private Date selectedDate;
    @Column(name="CINEMAID")
    private Integer cinemaId;

    public Schedule(Integer scheduleId, Integer movieId, Time timeStart, Time timeEnd, Date selectedDate, Integer cinemaId) {
        this.scheduleId = scheduleId;
        this.movieId = movieId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.selectedDate = selectedDate;
        this.cinemaId = cinemaId;
    }

    public Schedule() {

    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
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

    public Integer getCinemaId() {
           return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }
}
