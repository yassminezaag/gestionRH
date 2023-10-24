package com.yass.gestionrh.repository;

import com.yass.gestionrh.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
