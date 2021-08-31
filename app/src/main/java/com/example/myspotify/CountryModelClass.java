package com.example.myspotify;

public class CountryModelClass {
    public static String country;
    public static String code;

    public CountryModelClass(String country, String code) {
        this.country = country;
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
