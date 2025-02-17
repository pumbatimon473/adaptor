package com.assignment.question;

import java.util.ArrayList;
import java.util.List;

import com.assignment.question.external.FacebookApi;
import com.assignment.question.external.FacebookPost;

public class FacebookApiAdapter implements SocialMediaAdapter {
    private FacebookApi adaptee = new FacebookApi();

    // Dependency Injection
    // public FacebookApiAdapter(FacebookApi facebook) {
    //     this.adaptee = facebook;
    // }

    @Override
    public List<SocialMediaPost> getSocialMediaPosts(Long userId, Long timestamp) {
        List<FacebookPost> facebookPosts = this.adaptee.fetchFacebookPosts(userId, timestamp);
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();
        for (FacebookPost facebookPost : facebookPosts) {
            socialMediaPosts.add(SocialMediaPost.builder()
                .postId(facebookPost.getId())
                .content(facebookPost.getStatus())
                .userId(facebookPost.getUserId())
                .timestamp(facebookPost.getTimestamp())
                .build()
            );
        }
        return socialMediaPosts;
    }

    @Override
    public void publishSocialMediaPost(Long userId, String content) {
        this.adaptee.postFacebookStatus(userId, content);
    }
    
}
