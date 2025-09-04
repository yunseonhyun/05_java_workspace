package edu.practice.day8.model;

public class Twitter implements SocialMedia {
    private String tweet;

    // 생성자
    public Twitter() {
    }

    public Twitter(String tweet) {
        this.tweet = tweet;
    }

    // 게터 세터
    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public void post() {
        System.out.println("🐦 트위터에 트윗합니다: {" + getTweet() + "}");
    }

    @Override
    public void like() {
        System.out.println("❤️ 트윗에 좋아요를 눌렀습니다!");
    }

    @Override
    public void share() {
        System.out.println("🔄 리트윗했습니다!");
    }
}
