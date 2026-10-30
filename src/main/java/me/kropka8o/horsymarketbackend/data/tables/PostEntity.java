package me.kropka8o.horsymarketbackend.data.tables;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.NonNull;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @NonNull
    private String photoUrl;

    @NonNull
    private String name;

    @NonNull
    private String father;

    @NonNull
    private String mother;

    @Nullable
    private String coat;

    @Nullable
    private float size;

    @NonNull
    private String gender;

    @NonNull
    private Date birthday;

    @NonNull
    private long minimumBid;

    @NonNull
    private Instant closingTime;

    @Nullable
    private String discipline;

    public PostEntity(){

    }
}
