package com.example.blogsample2.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address implements Serializable {
    private String streetName;
    private String city;
    private String zipCode;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
