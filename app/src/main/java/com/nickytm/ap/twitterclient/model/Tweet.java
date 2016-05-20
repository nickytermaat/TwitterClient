package com.nickytm.ap.twitterclient.model;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Tweet {

    private Coordinate coordinate;
    private String created_at;
    private Entity entity;
    private int favorited_count;
    private boolean favorited;
    private long id;
    private String id_str;
    private int retweet_count;
    private boolean retweeted;
    private Place place;
    private SpannableString text;
    private User user;
    private ArrayList<Hashtag> hashtags;
    private ArrayList<Url> urls;
    private ArrayList<Media> media;
    private ArrayList<UserMention> user_mentions;


    public Tweet(Coordinate coordinate, String created_at, Entity entity, int favorited_count, boolean favorited, long id, String id_str, int retweet_count, boolean retweeted, Place place, SpannableString text, User user, ArrayList<Hashtag> hashtags, ArrayList<Url> urls, ArrayList<Media> media, ArrayList<UserMention> user_mentions) {
        this.coordinate = coordinate;
        this.created_at = created_at;
        this.entity = entity;
        this.favorited_count = favorited_count;
        this.favorited = favorited;
        this.id = id;
        this.id_str = id_str;
        this.retweet_count = retweet_count;
        this.retweeted = retweeted;
        this.place = place;
        this.text = text;
        this.user = user;
        this.hashtags = hashtags;
        this.urls = urls;
        this.media = media;
        this.user_mentions = user_mentions;
    }

    public Tweet (JSONObject jsonObject) throws JSONException{

        this.created_at = jsonObject.getString("created_at");
        this.favorited_count = jsonObject.getInt("favorite_count");
        this.favorited = jsonObject.getBoolean("favorited");
        this.id = jsonObject.getLong("id");
        this.id_str = jsonObject.getString("id_str");
        this.retweet_count = jsonObject.getInt("retweet_count");
        this.retweeted = jsonObject.getBoolean("retweeted");
        this.text = (SpannableString) Spannable.Factory.getInstance().newSpannable(jsonObject.getString("text"));

        this.user = new User(jsonObject.getJSONObject("user"));
//        this.place = new Place(jsonObject.getJSONObject("place"));
//        this.coordinate = new Coordinate(jsonObject.getJSONObject("coordinates"));
        // hashtag, media, url, usermention
//        this.entity = new Entity(jsonObject.getJSONArray("entities"));
        this.hashtags = new ArrayList<>();
        this.user_mentions = new ArrayList<>();
//
        if (jsonObject.getJSONObject("entities").has("hashtags")){

            JSONArray hashtagEntities = jsonObject.getJSONObject("entities").getJSONArray("hashtags");

            for (int i = 0; i < hashtagEntities.length(); i++) {
                this.hashtags.add(new Hashtag(hashtagEntities.getJSONObject(i)));
                this.text.setSpan(new BackgroundColorSpan(Color.GREEN), hashtagEntities.getJSONObject(i).getJSONArray("indices").getInt(0), hashtagEntities.getJSONObject(i).getJSONArray("indices").getInt(1), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }

        if (jsonObject.getJSONObject("entities").has("user_mentions")){

            JSONArray usermentionsEntities = jsonObject.getJSONObject("entities").getJSONArray("user_mentions");

            for (int i = 0; i < usermentionsEntities.length() ; i++) {
                this.user_mentions.add(new UserMention(usermentionsEntities.getJSONObject(i)));
                this.text.setSpan(new BackgroundColorSpan(Color.BLUE), usermentionsEntities.getJSONObject(i).getJSONArray("indices").getInt(0), usermentionsEntities.getJSONObject(i).getJSONArray("indices").getInt(1), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }

    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Entity getEntity() {
        return entity;
    }

    public int getFavorited_count() {
        return favorited_count;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public long getId() {
        return id;
    }

    public String getId_str() {
        return id_str;
    }

    public int getRetweet_count() {
        return retweet_count;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public Place getPlace() {
        return place;
    }

    public SpannableString getText() {
        return text;
    }

    public User getUser() {
        return user;
    }
}
