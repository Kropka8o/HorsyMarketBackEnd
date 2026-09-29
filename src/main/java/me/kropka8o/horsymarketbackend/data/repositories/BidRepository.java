package me.kropka8o.horsymarketbackend.data.repositories;

import me.kropka8o.horsymarketbackend.data.tables.BidEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepository extends JpaRepository<BidEntity, Long> {
}
