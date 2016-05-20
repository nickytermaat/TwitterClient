package com.nickytm.ap.twitterclient.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Entity {

    private int indices[] = new int[2];

    public Entity(JSONArray jsonArray) throws JSONException {
        this.indices[0] = jsonArray.getInt(0);
        this.indices[1] = jsonArray.getInt(1);
    }

    public Entity(int[] indices) {
        this.indices = indices;
    }
}
