package com.nickytm.ap.twitterclient.model;

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
}
