package me.kropka8o.horsymarketbackend.data.tables;

import jakarta.persistence.*;
import lombok.NonNull;

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

    public PostEntity(){

    }
}
