package me.kropka8o.horsymarketbackend.data.repositories;

import me.kropka8o.horsymarketbackend.data.tables.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
