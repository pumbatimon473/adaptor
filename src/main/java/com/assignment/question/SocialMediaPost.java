package com.assignment.question;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class SocialMediaPost {
    private String postId;
    private String content;
    private Long userId;
    private Long timestamp;
}