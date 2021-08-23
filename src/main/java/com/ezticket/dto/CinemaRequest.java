package com.ezticket.dto;

public class CinemaRequest {
    private String name;
    private Integer cinemaId;

    public CinemaRequest(String name) {
        this.name = name;
    }

    public CinemaRequest(){

    }

    public CinemaRequest(String name, Integer cinemaId) {
        this.cinemaId = cinemaId;
        this.name = name;
    }

    public String getName() {
        return name;
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
