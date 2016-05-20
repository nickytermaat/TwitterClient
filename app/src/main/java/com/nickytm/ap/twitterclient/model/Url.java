package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Url extends Entity  {

    private String display_url;
    private String expanded_url;
    private String url;

    public Url(int[] indices, String display_url, String expanded_url, String url) {
        super(indices);
        this.display_url = display_url;
        this.expanded_url = expanded_url;
        this.url = url;
    }

    public Url(JSONObject jsonObject) throws JSONException {
        super(jsonObject.getJSONArray("indices"));
        this.display_url = jsonObject.getString("display_url");
        this.expanded_url = jsonObject.getString("expanded_url");
        this.url = jsonObject.getString("url");
    }
}
