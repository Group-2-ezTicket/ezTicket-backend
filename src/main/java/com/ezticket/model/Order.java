package com.ezticket.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDERID")
    private Integer orderId;
    @Column(name="USERID")
    private Integer userId;
    @Column(name="FOODLIST")
    private String foodList;
    @Column(name="TOTALPRICE")
    private Float totalPrice;
    private String email;
    @Column(name="ORDERSTATUS")
    private Boolean orderStatus;
    @Column(name="TRANSACTIONID")
    private String transactionId;
    @Column(name="SCHEDULEID")
    private Integer scheduleId;

    public Order() {
    }

    public Order(Integer userId, String foodList, Float totalPrice, String email, Boolean orderStatus, String transactionId) {
        this.userId = userId;
        this.foodList = foodList;
        this.totalPrice = totalPrice;
        this.email = email;
        this.orderStatus = orderStatus;
        this.transactionId = transactionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Order(Integer userId, String foodList, Float totalPrice, String email, Boolean orderStatus, String transactionId, Integer scheduleId) {
        this.userId = userId;
        this.foodList = foodList;
        this.totalPrice = totalPrice;
        this.email = email;
        this.orderStatus = orderStatus;
        this.transactionId = transactionId;
        this.scheduleId = scheduleId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFoodList() {
        return foodList;
    }

    public void setFoodList(String foodList) {
        this.foodList = foodList;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }
}
