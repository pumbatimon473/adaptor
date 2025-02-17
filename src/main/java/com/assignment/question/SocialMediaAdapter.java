package com.assignment.question;

import java.util.List;

// Target Interface - expected by the client
public interface SocialMediaAdapter {
    List<SocialMediaPost> getSocialMediaPosts(Long userId, Long timestamp);
    void publishSocialMediaPost(Long userId, String content);
}