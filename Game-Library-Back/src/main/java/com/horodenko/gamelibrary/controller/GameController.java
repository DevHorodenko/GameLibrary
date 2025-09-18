package com.horodenko.gamelibrary.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horodenko.gamelibrary.model.Game;
import com.horodenko.gamelibrary.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {

    private GameService gameService;

    @PostMapping("/create")
    public String createGame(Game game) {
        String validateNull = gameService.gameValuesIsNull(game);

        if (validateNull == null) {

            return "Game created successfully";
        } else {
            return validateNull;
        }
    }
}
