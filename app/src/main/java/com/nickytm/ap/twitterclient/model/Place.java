package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

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

    public Place(JSONObject jsonObject) throws JSONException {
        this.country = jsonObject.getString("country");
        this.country_code = jsonObject.getString("country_code");
        this.id = jsonObject.getString("id");
        this.name = jsonObject.getString("name");
        this.place_type = jsonObject.getString("place_type");
        this.url = jsonObject.getString("url");
    }
}
