package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.dslist.Game;
import com.devsuperior.dslist.entities.dslist.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
