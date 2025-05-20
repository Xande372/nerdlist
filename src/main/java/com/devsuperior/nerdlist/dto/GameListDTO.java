package com.devsuperior.nerdlist.dto;

import com.devsuperior.nerdlist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    // somente os getters por não ter usado o beanUtils
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
