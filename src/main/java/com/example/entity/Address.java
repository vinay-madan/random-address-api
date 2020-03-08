package com.example.entity;

public class Address {


    private String house;
    private String street;
    private String postalcode;
    private String city;
    private String county;
    private String state;
    private String statecode;
    private String country;
    private String countrycode;


    public Address() {

    }

    public Address(String house, String street, String postalcode, String city, String county, String state, String statecode,
                   String country, String countrycode) {
        this.house = house;
        this.street = street;
        this.postalcode = postalcode;
        this.city = city;
        this.county = county;
        this.state = state;
        this.statecode = statecode;
        this.country = country;
        this.countrycode = countrycode;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
