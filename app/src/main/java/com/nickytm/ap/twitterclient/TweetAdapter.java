package com.nickytm.ap.twitterclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Remy on 13-5-2016.
 */
public class TweetAdapter extends ArrayAdapter<Tweet>{
    public TweetAdapter(Context context) {
        super(context, 0, );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext().inflate)
        }
    }
}
