package me.kropka8o.horsymarketbackend.data.tables;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.NonNull;

import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToMany
    @JoinTable(
        name = "user_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<RoleEntity> roles;

    @NonNull
    private String name;

    @Nullable
    private int kvkNumber;

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

    public UserEntity(){
    }
}
