package com.devsuperior.nerdlist.repositories;

import com.devsuperior.nerdlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
