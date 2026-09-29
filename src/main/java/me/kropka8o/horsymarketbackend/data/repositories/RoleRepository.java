package me.kropka8o.horsymarketbackend.data.repositories;

import me.kropka8o.horsymarketbackend.data.tables.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
