package com.nickytm.ap.twitterclient.model;

import org.json.JSONException;
import org.json.JSONObject;

public class UserMention extends Entity {

    private int id;
    private String id_str;
    private String name;
    private String screen_name;

    public UserMention(int[] indices, int id, String id_str, String name, String screen_name) {
        super(indices);
        this.id = id;
        this.id_str = id_str;
        this.name = name;
        this.screen_name = screen_name;
    }


