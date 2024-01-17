package org.example.models;

public class User {
    private int userId;
    private int products;
    private int reviews;

    public User(int userId, int products, int reviews) {
        this.userId = userId;
        this.products = products;
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", products=" + products +
                ", reviews=" + reviews +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProducts() {
        return products;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
