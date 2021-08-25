package com.ezticket.dto;

public class FoodResponse {
    private Integer packageId;
    private String packageName;
    private String packageDetails;
    private Integer packagePrice;

    public FoodResponse() {

    }

    public FoodResponse(String packageName, String packageDetails, Integer packagePrice) {
        this.packageName = packageName;
        this.packageDetails = packageDetails;
        this.packagePrice = packagePrice;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }

    public Integer getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Integer packagePrice) {
        this.packagePrice = packagePrice;
    }
}
