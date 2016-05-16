package com.nickytm.ap.twitterclient.model;

public class Media extends Entity {

    private String display_url;
    private String expand_url;
    private int id;
    private String id_str;
    private String media_url;
    private String type;
    private String url;

    public Media(int[] indices, String display_url, String expand_url, int id, String id_str, String media_url, String type, String url) {
        super(indices);
        this.display_url = display_url;
        this.expand_url = expand_url;
        this.id = id;
        this.id_str = id_str;
        this.media_url = media_url;
        this.type = type;
        this.url = url;
    }
}
