package com.nickytm.ap.twitterclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import com.nickytm.ap.twitterclient.model.Tweet;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Tweet> tweets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TweetAdapter tweetAdapter = new TweetAdapter(this, R.layout.list_tweet, tweets);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(tweetAdapter);

        try {
            TweetParser tp = new TweetParser();
            ArrayList<Tweet> tweets = tp.getTweetsFromFile(this, "tweets.json");
        } catch (Exception ex) {
            System.out.println("exception occured, file not found");
        }

    }
}
