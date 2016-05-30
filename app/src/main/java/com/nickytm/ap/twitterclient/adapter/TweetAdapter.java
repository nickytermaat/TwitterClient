package com.nickytm.ap.twitterclient.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nickytm.ap.twitterclient.R;
import com.nickytm.ap.twitterclient.model.Tweet;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class TweetAdapter extends ArrayAdapter<Tweet> {

    public TweetAdapter(Context context, int resource, ArrayList<Tweet> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView ( int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tweet, parent, false);
        }

        // Get image
        // Save image if first time
        // Compare image to already existing saved image, if not existing download the image


        Tweet tweet = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.unicorn);

        new ImageParser(imageView).execute(tweet.getUser().getProfile_image_url_https());

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

    public class ImageParser extends AsyncTask<String, Void, Bitmap> {

        private ImageView imageView;

        public ImageParser(ImageView imageView){
            this.imageView = imageView;
        }

        public ImageView getImageView() {
            return imageView;
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
