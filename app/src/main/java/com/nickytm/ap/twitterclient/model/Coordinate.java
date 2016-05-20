package com.nickytm.ap.twitterclient.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Coordinate {

    private float coordinate[] = new float[2];
    private String type;

    public Coordinate(float[] coordinates, String type) {
        this.coordinate = coordinates;
        this.type = type;
    }

    public Coordinate(JSONArray jsonArray) throws JSONException {
        this.coordinate[0] = jsonArray.getInt(0);
        this.coordinate[1] = jsonArray.getInt(1);
    }

    public Coordinate(JSONObject jsonObject) throws JSONException{
        this.type = jsonObject.getString("type");
    }

}
