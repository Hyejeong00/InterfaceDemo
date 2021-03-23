package com.example.interfaceprogram;

public class Country implements Measurable{
    public double area;
    private String country;

    public Country(String country, double area) {
        this.country = country;
        this.area = area;
    }

    public Country() {

    }

    public double getMeasure() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
