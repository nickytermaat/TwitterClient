package com.nickytm.ap.twitterclient.model;

public class Place {

    private String country;
    private String country_code;
    private String id;
    private String name;
    private String place_type;
    private String url;

    public Place(String country, String country_code, String id, String name, String place_type, String url) {
        this.country = country;
        this.country_code = country_code;
        this.id = id;
        this.name = name;
        this.place_type = place_type;
        this.url = url;
    }
}
