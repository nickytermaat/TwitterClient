package com.nickytm.ap.twitterclient.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import com.nickytm.ap.twitterclient.R;
import com.nickytm.ap.twitterclient.TweetParser;
import com.nickytm.ap.twitterclient.adapter.TweetAdapter;
import com.nickytm.ap.twitterclient.model.Tweet;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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

    public class ImageParser extends AsyncTask<String, Void, Bitmap> {

        private ImageView imageView;

        public ImageParser(ImageView imageView){
            this.imageView = imageView;
        }

        @Override
        protected Bitmap doInBackground(String... params) {
            HttpURLConnection urlConnection = null;

            try {
                URL uri = new URL(params[0]);
                urlConnection = (HttpURLConnection) uri.openConnection();

                InputStream inputStream = urlConnection.getInputStream();
                if (inputStream != null) {
                    return BitmapFactory.decodeStream(inputStream);
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {

            imageView.setImageBitmap(bitmap);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }



}
