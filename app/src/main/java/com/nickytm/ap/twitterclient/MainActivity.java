package com.nickytm.ap.twitterclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private List<Tweet> tweets = TweetCollection.getInstance().getTweets();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TweetAdapter adapter = new TweetAdapter(this, R.layout.list_tweet, tweets);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }



}
