package me.kropka8o.horsymarketbackend.Models;

import jakarta.annotation.Nullable;
import lombok.NonNull;

public class User {
    @NonNull
    private int id;
    @NonNull
    private int rollId;
    @NonNull
    private String name;
    @Nullable
    private int kvkNum;
    @Nullable
    private String businessName;
    @Nullable
    private String city;
    @Nullable
    private String street;
    @Nullable
    private String postalCode;
    @Nullable
    private String number;
    @Nullable
    private String email;
    @NonNull
    private String password;
    @NonNull
    private long balance;
}
