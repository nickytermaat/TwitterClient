package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {

    private Coordinate coordinate;
    private String created_at;
    private Entity entity;
    private int favorited_count;
    private boolean favorited;
    private long id;
    private String id_str;
    private int retweet_count;
    private boolean retweeted;
    private Place place;
    private String text;
    private User user;

    public Tweet(Coordinate coordinate, String created_at, Entity entity, int favorited_count, boolean favorited, int id, String id_str, int retweet_count, boolean retweeted, Place place, String text, User user) {
        this.coordinate = coordinate;
        this.created_at = created_at;
        this.entity = entity;
        this.favorited_count = favorited_count;
        this.favorited = favorited;
        this.id = id;
        this.id_str = id_str;
        this.retweet_count = retweet_count;
        this.retweeted = retweeted;
        this.place = place;
        this.text = text;
        this.user = user;
    }

    public Tweet (JSONObject jsonObject) throws JSONException{
        this.user = new User(jsonObject.getJSONObject("user"));
        //this.coordinate = jsonObject.get
        this.created_at = jsonObject.getString("created_at");
        //this.entity = jsonObject.get
        this.favorited_count = jsonObject.getInt("favorite_count");
        this.favorited = jsonObject.getBoolean("favorited");
        this.id = jsonObject.getLong("id");
        this.id_str = jsonObject.getString("id_str");
        this.retweet_count = jsonObject.getInt("retweet_count");
        this.retweeted = jsonObject.getBoolean("retweeted");
        //this.place =
        this.text = jsonObject.getString("text");
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getFavorited_count() {
        return favorited_count;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public long getId() {
        return id;
    }

    public String getId_str() {
        return id_str;
    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public Place getPlace() {
        return place;
    }

    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }
}
