package com.nickytm.ap.twitterclient.model;

import org.json.JSONArray;
import org.json.JSONException;

public class Entity {

    private int indices[] = new int[2];
//    private Hashtag hashtag;
//    private Url url;
//    private Media media;
//    private UserMention usermention;

    public Entity(JSONArray jsonArray) throws JSONException {
        this.indices[0] = jsonArray.getInt(0);
        this.indices[1] = jsonArray.getInt(1);
    }

//    public Entity (JSONObject jsonObject) throws JSONException {
//        this.hashtag = new Hashtag(jsonObject.getJSONObject("hashtags"));
//        this.url = new Url(jsonObject.getJSONObject("urls"));
//        this.media = new Media(jsonObject.getJSONObject("media"));
//        this.usermention = new UserMention(jsonObject.getJSONObject("user_mentions"));
//    }

    public Entity(int[] indices) {
        this.indices = indices;
    }
}
