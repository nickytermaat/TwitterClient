package com.nickytm.ap.twitterclient.model;

public class Tweet {

    private Coordinate coordinate;
    private String created_at;
    private Entity entity;
    private int favorited_count;
    private boolean favorited;
    private int id;
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

    /* private String userName;
    private String atName;
    private String tweetText;
    private String timeStamp;
    //image

    public Tweet(String userName, String atName, String tweetText, String timeStamp) {
        this.userName = userName;
        this.atName = atName;
        this.tweetText = tweetText;
        this.timeStamp = timeStamp;
    }

    //get image by unique atName

    public String getUserName() {
        return userName;
    }

    public String getAtName() {
        return atName;
    }

    public String getTweetText() {
        return tweetText;
    }

    public String getTimeStamp() {
        return timeStamp;
    }*/
}
