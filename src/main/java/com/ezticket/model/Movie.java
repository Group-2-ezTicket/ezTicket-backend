package com.ezticket.model;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MOVIEID")
    private Integer movieId;
    @Column(name="THEATREID")
    private Integer theaterId;
    @Column(name="MOVIETITLE")
    private String movieTitle;
    private String synopsis;
    private Integer rating;
    private Integer duration;
    private String genre;
    private Integer price;

    public Movie(Integer theaterId, String movieTitle, String synopsis, Integer rating, Integer duration, String genre, Integer price) {
        this.theaterId = theaterId;
        this.movieTitle = movieTitle;
        this.synopsis = synopsis;
        this.rating = rating;
        this.duration = duration;
        this.genre = genre;
        this.price = price;
    }

    public Movie(){}

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}