import com.assignment.question.FacebookApiAdapter;
import com.assignment.question.SocialMediaAdapter;
import com.assignment.question.SocialMediaPost;
import com.assignment.question.TwitterApiAdapter;
import com.assignment.question.external.FacebookApi;
import com.assignment.question.external.FacebookPost;
import com.assignment.question.external.TwitterApi;
import com.assignment.question.external.TwitterTweet;

import java.util.List;

public class SocialMediaManager {
    private FacebookApi facebookApi = new FacebookApi();
    private TwitterApi twitterApi = new TwitterApi();

    public void getMessages(Long userId, Long timestamp, String platform) {
        List<SocialMediaPost> socialMediaPosts; 
        SocialMediaAdapter socialMediaAdapter;
        if (platform.equals("facebook")) {
            // List<FacebookPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
            // socialMediaAdapter = new FacebookApiAdapter(facebookApi);
            socialMediaAdapter = new FacebookApiAdapter();
            socialMediaPosts = socialMediaAdapter.getSocialMediaPosts(userId, timestamp);
        } else if (platform.equals("twitter")) {
            // List<TwitterTweet> tweets = twitterApi.getTweets(userId);
            // socialMediaAdapter = new TwitterApiAdapter(twitterApi);
            socialMediaAdapter = new TwitterApiAdapter();
            socialMediaPosts = socialMediaAdapter.getSocialMediaPosts(userId, timestamp);
        }

        // Convert the posts/tweets to a common format
        
    }
}