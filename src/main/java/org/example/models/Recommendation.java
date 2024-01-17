package org.example.models;

public class Recommendation {
    private int appId;
    private int helpful;
    private int funny;
    private String date;
    private boolean isRecommended;
    private double hours;
    private int userId;
    private int reviewId;

    public Recommendation(int appId, int helpful, int funny, String date,
                          boolean isRecommended, double hours, int userId, int reviewId) {
        this.appId = appId;
        this.helpful = helpful;
        this.funny = funny;
        this.date = date;
        this.isRecommended = isRecommended;
        this.hours = hours;
        this.userId = userId;
        this.reviewId = reviewId;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "appId=" + appId +
                ", helpful=" + helpful +
                ", funny=" + funny +
                ", date='" + date + '\'' +
                ", isRecommended=" + isRecommended +
                ", hours=" + hours +
                ", userId=" + userId +
                ", reviewId=" + reviewId +
                '}';
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getHelpful() {
        return helpful;
    }

    public void setHelpful(int helpful) {
        this.helpful = helpful;
    }

    public int getFunny() {
        return funny;
    }

    public void setFunny(int funny) {
        this.funny = funny;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isRecommended() {
        return isRecommended;
    }

    public void setRecommended(boolean recommended) {
        isRecommended = recommended;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
}
