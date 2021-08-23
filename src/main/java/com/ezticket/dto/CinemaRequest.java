package com.ezticket.dto;

public class CinemaRequest {
    private String cinema_name;

    public CinemaRequest(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }
}
