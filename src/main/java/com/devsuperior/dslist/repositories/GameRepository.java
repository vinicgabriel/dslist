package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.dslist.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
