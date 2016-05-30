package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    private boolean contributers_enabled;
    private String created_at;
    private boolean default_profile;
    private boolean default_profile_picture;
    private String profile_image_url;
    private String profile_image_url_https;
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
        this.profile_image_url = jsonObject.getString("profile_image_url");
        this.profile_image_url_https = jsonObject.getString("profile_image_url_https");
        this.description = jsonObject.getString("description");
        //this.entity = jsonObject.get
        this.favourites_count = jsonObject.getInt("favourites_count");
        this.following_count = jsonObject.getInt("followers_count");
        this.id = jsonObject.getLong("id");
        this.id_str = jsonObject.getString("id_str");
        this.name = jsonObject.getString("name");
        this.profile_background_color = jsonObject.getString("profile_background_color");
        this.screen_name = jsonObject.getString("screen_name");
    }

    public User(boolean contributers_enabled, String created_at, boolean default_profile, boolean default_profile_picture, String profile_image_url, String profile_image_url_https, String description, Entity entity, int favourites_count, int following_count, long id, String id_str, String name, String profile_background_color, String screen_name) {
        this.contributers_enabled = contributers_enabled;
        this.created_at = created_at;
        this.default_profile = default_profile;
        this.default_profile_picture = default_profile_picture;
        this.profile_image_url = profile_image_url;
        this.profile_image_url_https = profile_image_url_https;
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

    public boolean isContributers_enabled() {
        return contributers_enabled;
    }

    public void setContributers_enabled(boolean contributers_enabled) {
        this.contributers_enabled = contributers_enabled;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public boolean isDefault_profile() {
        return default_profile;
    }

    public void setDefault_profile(boolean default_profile) {
        this.default_profile = default_profile;
    }

    public boolean isDefault_profile_picture() {
        return default_profile_picture;
    }

    public void setDefault_profile_picture(boolean default_profile_picture) {
        this.default_profile_picture = default_profile_picture;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getProfile_image_url_https() {
        return profile_image_url_https;
    }

    public void setProfile_image_url_https(String profile_image_url_https) {
        this.profile_image_url_https = profile_image_url_https;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public int getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(int favourites_count) {
        this.favourites_count = favourites_count;
    }

    public int getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(int following_count) {
        this.following_count = following_count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile_background_color() {
        return profile_background_color;
    }

    public void setProfile_background_color(String profile_background_color) {
        this.profile_background_color = profile_background_color;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }
}
