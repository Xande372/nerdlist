package com.devsuperior.nerdlist.services;

import com.devsuperior.nerdlist.dto.GameDTO;
import com.devsuperior.nerdlist.dto.GameListDTO;
import com.devsuperior.nerdlist.dto.GameMinDTO;
import com.devsuperior.nerdlist.entities.Game;
import com.devsuperior.nerdlist.entities.GameList;
import com.devsuperior.nerdlist.repositories.GameListRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional()
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
