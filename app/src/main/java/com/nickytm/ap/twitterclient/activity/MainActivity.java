package com.nickytm.ap.twitterclient.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.nickytm.ap.twitterclient.R;
import com.nickytm.ap.twitterclient.TweetParser;
import com.nickytm.ap.twitterclient.adapter.TweetAdapter;
import com.nickytm.ap.twitterclient.model.Tweet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Tweet> tweets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        try {
            TweetParser tp = new TweetParser();
            tweets = tp.getTweetsFromFile(this, "tweets.json");

            TweetAdapter tweetAdapter = new TweetAdapter(this, R.layout.list_tweet, tweets);

            listView.setAdapter(tweetAdapter);
        } catch (Exception ex) {
            System.out.println("exception occured, file not found");
        }


    }



}
