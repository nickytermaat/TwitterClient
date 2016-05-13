package com.nickytm.ap.twitterclient;

/**
 * Created by Nicky on 13/05/2016.
 */
public class Tweet {

    private String userName;
    private String tweet;

    public Tweet(String tweet) {
        this.tweet = tweet;
    }

    public String getUserName() {
        return userName;
    }

    public String getTweet() {
        return tweet;
    }
}
