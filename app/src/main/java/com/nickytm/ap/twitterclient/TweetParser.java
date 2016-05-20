package com.nickytm.ap.twitterclient;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.nickytm.ap.twitterclient.model.Tweet;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Nicky on 17/05/2016.
 */
public class TweetParser {
    /**
     * gets a JSON string and parses it into a list of tweets
     *
     * @param context
     * @param filename
     * @returns a list of tweets
     */
    public ArrayList<Tweet> getTweetsFromFile(Context context, String filename){
        try{
            String JSONString = readAssetIntoString(context, filename);
            JSONObject jobj = new JSONObject(JSONString);
            JSONArray jsonArray = jobj.getJSONArray("statuses");

            // for every element in the jsonArray, create a tweetobject
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject tweetobj = jsonArray.getJSONObject(i);

            }
        }
        catch(Exception e){
            Log.e(this.getClass().getSimpleName(), e.getMessage());
        }
        return null;
    }
    /**
     * Reads an asset file and returns a string with the full contents.
     *
     * @param filename  The filename of the file to read.
     * @return          The contents of the file.
     * @throws IOException  If file could not be found or not read.
     */
    private String readAssetIntoString(Context context,
                                       String filename) throws IOException {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {
            InputStream is = context.getAssets().open(filename, AssetManager.ACCESS_BUFFER);
            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

}
