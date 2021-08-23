package com.ezticket.dto;

public class CinemaResponse {
    private String name;
    private Integer cinemaId;

    public CinemaResponse() {

    }

    public CinemaResponse(String name, Integer cinemaId) {
        this.name = name;
        this.cinemaId = cinemaId;
    }

    public CinemaResponse(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }
}
