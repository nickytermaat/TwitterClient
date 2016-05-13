package com.nickytm.ap.twitterclient;

/**
 * Created by Nicky on 13/05/2016.
 */
public class Tweet {

    private String userName;
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
    }
}
