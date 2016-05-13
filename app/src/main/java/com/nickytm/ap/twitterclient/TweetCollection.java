package com.nickytm.ap.twitterclient;

import java.util.ArrayList;

/**
 * Created by Remy on 13-5-2016.
 */
public class TweetCollection {

    private static TweetCollection instance;
    private ArrayList<Tweet> tweets;

    private TweetCollection(){
        tweets = new ArrayList<>();
        addTweet("Remy", "remyeijkholt", "this ismy first tweet everrr!!11!!1!!11!", "5min");
        addTweet("Nicky", "nickytermaat", "@remyeijkholt omg whateverrr #uncool", "3min");
    }

    public static TweetCollection getInstance(){
        if(instance == null){
            instance = new TweetCollection();
        }
        return instance;
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    public void addTweet(String userName, String atName, String tweetText, String timeStamp){
        Tweet tweet = new Tweet(userName, atName, tweetText, timeStamp);
        addTweet(tweet);
    }

    public Tweet getTweet(int position){
        return tweets.get(position);
    }
}
