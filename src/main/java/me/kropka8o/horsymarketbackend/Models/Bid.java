package me.kropka8o.horsymarketbackend.Models;

import lombok.NonNull;

public class Bid {
    @NonNull
    private int id;
    @NonNull
    private long amount;
    @NonNull
    private int userId;
    @NonNull
    private int postId;
}
