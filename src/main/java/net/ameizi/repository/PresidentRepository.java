package net.ameizi.repository;

import net.ameizi.entity.President;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresidentRepository extends JpaRepository<President, Integer> {
}