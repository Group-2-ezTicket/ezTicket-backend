package com.ezticket.dto;

import org.springframework.stereotype.Component;


public class OrderResponse {

    private String cinemaName;
    private String schedule;
    private String movieName;
    private Integer moviePrice;
    private String foodList;
    private Float totalPrice;
    private Boolean orderStatus;

    public OrderResponse(){
    }

    public OrderResponse(String cinemaName, String schedule, String movieName, Integer moviePrice, String foodOrder, Float totalPrice, Boolean orderStatus) {
        this.cinemaName = cinemaName;
        this.schedule = schedule;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
        this.foodList = foodOrder;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Integer moviePrice) {
        this.moviePrice = moviePrice;
    }

    public String getFoodOrder() {
        return foodList;
    }

    public void setFoodOrder(String foodOrder) {
        this.foodList = foodOrder;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
}
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class OrderResponse {
//    private Integer userId;
//    private String foodList;
//    private Float totalPrice;
//    private String email;
//    private Boolean orderStatus;
//    private String transactionId;
//    private Integer scheduleId;
//
//    public OrderResponse() {
//    }
//
//    public OrderResponse(Integer userId, String foodList, Float totalPrice, String email, Boolean orderStatus, String transactionId) {
//        this.userId = userId;
//        this.foodList = foodList;
//        this.totalPrice = totalPrice;
//        this.email = email;
//        this.orderStatus = orderStatus;
//        this.transactionId = transactionId;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public OrderResponse(Integer userId, String foodList, Float totalPrice, String email, Boolean orderStatus, String transactionId, Integer scheduleId) {
//        this.userId = userId;
//        this.foodList = foodList;
//        this.totalPrice = totalPrice;
//        this.email = email;
//        this.orderStatus = orderStatus;
//        this.transactionId = transactionId;
//        this.scheduleId = scheduleId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getFoodList() {
//        return foodList;
//    }
//
//    public void setFoodList(String foodList) {
//        this.foodList = foodList;
//    }
//
//    public Float getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(Float totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Boolean getOrderStatus() {
//        return orderStatus;
//    }
//
//    public void setOrderStatus(Boolean orderStatus) {
//        this.orderStatus = orderStatus;
//    }
//
//    public String getTransactionId() {
//        return transactionId;
//    }
//
//    public void setTransactionId(String transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    public Integer getScheduleId() {
//        return scheduleId;
//    }
//
//    public void setScheduleId(Integer scheduleId) {
//        this.scheduleId = scheduleId;
//    }
//}
