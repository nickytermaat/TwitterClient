package com.nickytm.ap.twitterclient;

public class TweetAdapter {
        //extends ArrayAdapter<Tweet>{
/*
    private List<Tweet> tweets;

    public TweetAdapter(Context context, int resource, List<Tweet> objects) {
        super(context, 0, TweetCollection.getInstance().getTweets());
        tweets = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_tweet, parent, false);
        }

    Tweet tweet = tweets.get(position);

        TextView userName = (TextView) convertView.findViewById(R.id.tv_userName);
        TextView atName = (TextView) convertView.findViewById(R.id.tv_atName);
        TextView tweetText = (TextView) convertView.findViewById(R.id.tv_tweet);
        TextView timeStamp = (TextView) convertView.findViewById(R.id.tv_time);

        userName.setText(tweet.getUserName());
        atName.setText(tweet.getAtName());
        tweetText.setText(tweet.getTweetText());
        timeStamp.setText(tweet.getTimeStamp());

        return convertView;
    }*/
}
