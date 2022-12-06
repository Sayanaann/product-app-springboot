package com.example.productapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class product {

    @Id
    @GeneratedValue
    private int id;
    private int productcode;
    private String productname;
    private int manufacdate;
    private int expdate;
    private String brand;
    private int price;
    private String sellername;
    private String distriname;

    public product() {
    }

    public product(int id, int productcode, String productname, int manufacdate, int expdate, String brand, int price, String sellername, String distriname) {
        this.id = id;
        this.productcode = productcode;
        this.productname = productname;
        this.manufacdate = manufacdate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.distriname = distriname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getManufacdate() {
        return manufacdate;
    }

    public void setManufacdate(int manufacdate) {
        this.manufacdate = manufacdate;
    }

    public int getExpdate() {
        return expdate;
    }

    public void setExpdate(int expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getDistriname() {
        return distriname;
    }

    public void setDistriname(String distriname) {
        this.distriname = distriname;
    }
}



