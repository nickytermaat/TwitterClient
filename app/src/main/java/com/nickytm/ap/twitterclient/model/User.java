package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    private boolean contributers_enabled;
    private String created_at;
    private boolean default_profile;
    private boolean default_profile_picture;
    private String description;
    private Entity entity;
    private int favourites_count;
    private int following_count;
    private long id;
    private String id_str;
    private String name;
    private String profile_background_color;
    private String screen_name;

    public User (JSONObject jsonObject) throws JSONException{
        this.contributers_enabled = jsonObject.getBoolean("contributors_enabled");
        this.created_at = jsonObject.getString("created_at");
        this.default_profile = jsonObject.getBoolean("default_profile");
        this.default_profile_picture = jsonObject.getBoolean("default_profile_image");
        this.description = jsonObject.getString("description");
        //this.entity = jsonObject.get
        this.favourites_count = jsonObject.getInt("favourites_count");
        this.following_count = jsonObject.getInt("followers_count");
        this.id = jsonObject.getInt("id");
        this.id_str = jsonObject.getString("id_str");
        this.name = jsonObject.getString("name");
        this.profile_background_color = jsonObject.getString("profile_background_color");
        this.screen_name = jsonObject.getString("screen_name");
    }

    public User(boolean contributers_enabled, String created_at, boolean default_profile, boolean default_profile_picture, String description, Entity entity, int favourites_count, int following_count, int id, String id_str, String name, String profile_background_color, String screen_name) {
        this.contributers_enabled = contributers_enabled;
        this.created_at = created_at;
        this.default_profile = default_profile;
        this.default_profile_picture = default_profile_picture;
        this.description = description;
        this.entity = entity;
        this.favourites_count = favourites_count;
        this.following_count = following_count;
        this.id = id;
        this.id_str = id_str;
        this.name = name;
        this.profile_background_color = profile_background_color;
        this.screen_name = screen_name;
    }

}
