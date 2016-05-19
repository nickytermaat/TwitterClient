package com.nickytm.ap.twitterclient.model;

public class
Hashtag extends Entity {

    private String text;

    public Hashtag(int[] indices, String text) {
        super(indices);
        this.text = text;
    }
}
