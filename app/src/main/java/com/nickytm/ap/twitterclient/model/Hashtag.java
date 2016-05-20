package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

public class
Hashtag extends Entity {

    private String text;

    public Hashtag(int[] indices, String text) {
        super(indices);
        this.text = text;
    }

    public Hashtag(JSONObject jsonObject) throws JSONException {
        super(jsonObject.getJSONArray("indices"));
        this.text = jsonObject.getString("text");

    }


}
