package me.kropka8o.horsymarketbackend.models;

import jakarta.annotation.Nullable;
import lombok.NonNull;

import java.sql.Timestamp;

public class Post {
    @NonNull
    private int id;
    @NonNull
    private int userId;
    @NonNull
    private String title;
    @NonNull
    private String father;
    @NonNull
    private String mother;
    @NonNull
    private String name;
    @NonNull
    private int age;
    @NonNull
    private float height;
    @NonNull
    private String description;
    @Nullable
    private long minBid;
    @Nullable
    private Timestamp closePost;

    // Constructors
//    public Post() {
//    }
//
//    public Post(String title, String content) {
//        this.title = title;
//    }
}
//    // Getters and Setters
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//}
