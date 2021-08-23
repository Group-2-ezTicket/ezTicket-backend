package com.ezticket.dto;

public class CinemaResponse {
    private String cinemaName;

    public CinemaResponse(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinema_name(String cinemaName) {
        this.cinemaName = cinemaName;
    }
}
