package com.nickytm.ap.twitterclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.nickytm.ap.twitterclient.model.Tweet;

import java.util.ArrayList;

public class TweetAdapter extends ArrayAdapter<Tweet> {

    private ArrayList<Tweet> tweets;

    public TweetAdapter(Context context, int resource, ArrayList<Tweet> objects) {
        super(context, resource, TweetParser.getInstance().getTweetsFromFile(context, "tweets.json"));
        tweets = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tweet, parent, false);
        }

    Tweet tweet = tweets.get(position);

        TextView screen_name = (TextView) convertView.findViewById(R.id.tv_userName);
        TextView name = (TextView) convertView.findViewById(R.id.tv_atName);
        TextView tweetText = (TextView) convertView.findViewById(R.id.tv_tweet);
        TextView timeStamp = (TextView) convertView.findViewById(R.id.tv_time);

        screen_name.setText(tweet.getUser().getScreen_name());
        name.setText(tweet.getUser().getName());
        tweetText.setText(tweet.getText());
        timeStamp.setText(tweet.getCreated_at());

        return convertView;
    }
}
