package me.kropka8o.horsymarketbackend.data.tables;

import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name = "roles")
public class RoleEntity {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    public RoleEntity(){

    }
}
