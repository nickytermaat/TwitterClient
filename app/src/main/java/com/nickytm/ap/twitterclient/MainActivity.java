package com.nickytm.ap.twitterclient;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.nickytm.ap.twitterclient.model.Tweet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //private List<Tweet> tweets = TweetCollection.getInstance().getTweets();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // TweetAdapter adapter = new TweetAdapter(this, R.layout.list_tweet, tweets);

        ListView listView = (ListView)findViewById(R.id.listView);
       // listView.setAdapter(adapter);

        TweetParser tp = new TweetParser();
        ArrayList<Tweet> tweets = tp.getTweetsFromFile(this, "tweets.json");


    }
}
