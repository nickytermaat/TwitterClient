package com.nickytm.ap.twitterclient.model;

public class User {

    private boolean contributers_enabled;
    private String created_at;
    private boolean default_profile;
    private boolean default_profile_picture;
    private String description;
    private Entity entity;
    private int favourites_count;
    private int following_count;
    private int id;
    private String id_str;
    private String name;
    private String profile_background_color;
    private String screen_name;

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
