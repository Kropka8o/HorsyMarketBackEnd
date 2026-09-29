package me.kropka8o.horsymarketbackend.data.tables;

import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name = "bids")
public class BidEntity {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private long amount;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostEntity post;

    public BidEntity(){

    }

}
