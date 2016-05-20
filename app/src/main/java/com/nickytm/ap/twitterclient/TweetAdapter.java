package com.nickytm.ap.twitterclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.nickytm.ap.twitterclient.model.Tweet;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TweetAdapter extends ArrayAdapter<Tweet> {

    public TweetAdapter(Context context, int resource, ArrayList<Tweet> objects) {
        super(context, resource, objects);
    }


        @Override
        public View getView ( int position, View convertView, ViewGroup parent){
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tweet, parent, false);
            }

            Tweet tweet = getItem(position);

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

    /*public String getPrettyTime(){
        //get current date
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MMMM:yyyy HH:mm:ss a");
        String strDate = sdf.format(c.getTime());

        //compare current time to timestamp
        
        //depending on the calculated diffrence print a line that tells the time ago. moments ago, 5 minutes ago, hours ago, etc..
        //return the pretty time
    }*/

    }
