package me.kropka8o.horsymarketbackend.data.repositories;

import me.kropka8o.horsymarketbackend.data.tables.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
