package com.ezticket.model;

import javax.persistence.*;

@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PACKAGEID")
    private Integer packageId;
    @Column(name = "PACKAGENAME")
    private String packageName;
    @Column(name = "PACKAGEDETAILS")
    private String packageDetails;
    @Column(name = "PACKAGEPRICE")
    private Integer packagePrice;

    public Food() {

    }

    public Food(String packageName, String packageDetails, Integer packagePrice) {
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
