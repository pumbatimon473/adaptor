package com.assignment.question;

import java.util.ArrayList;
import java.util.List;

import com.assignment.question.external.TwitterApi;
import com.assignment.question.external.TwitterTweet;

public class TwitterApiAdapter implements SocialMediaAdapter {
    private TwitterApi adaptee = new TwitterApi();

    // Dependency Injection
    // public TwitterApiAdapter(TwitterApi twitter) {
    //     this.adaptee = twitter;
    // }

    @Override
    public List<SocialMediaPost> getSocialMediaPosts(Long userId, Long timestamp) {
        List<TwitterTweet> tweets = this.adaptee.getTweets(userId);
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (TwitterTweet tweet : tweets) {
            socialMediaPosts.add(SocialMediaPost.builder()
                .postId(tweet.getId())
                .content(tweet.getTweet())
                .userId(tweet.getUserId())
                .build()
            );
        }
        return socialMediaPosts;
    }

    @Override
    public void publishSocialMediaPost(Long userId, String content) {
        this.adaptee.tweet(userId, content);
    }
    
}
