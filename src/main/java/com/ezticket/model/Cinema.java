package com.ezticket.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CINEMAID")
    private Integer cinemaId;
    @Column(name="NAME")
    private String name;

    public Cinema() {

    }

    public Cinema(String name) {
        this.name = name;
    }

    public Cinema(Integer cinemaId, String name) {
        this.cinemaId = cinemaId;
        this.name = name;
    }

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
