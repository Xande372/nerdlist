package com.devsuperior.nerdlist.repositories;

import com.devsuperior.nerdlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
