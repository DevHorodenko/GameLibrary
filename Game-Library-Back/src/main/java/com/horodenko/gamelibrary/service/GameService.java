package com.horodenko.gamelibrary.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.horodenko.gamelibrary.model.Game;
import com.horodenko.gamelibrary.repository.GameRepository;

public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public String gameValuesIsNull(Game game) {
        if (game == null) {
            return ("Game object cannot be null");
        } else if (game.getTitle() == null || game.getTitle().isEmpty()) {
            return ("Game title cannot be null or empty");
        } else if (game.getGenre() == null || game.getGenre().isEmpty()) {
            return ("Game genre cannot be null or empty");
        } else if (game.getPlatform() == null || game.getPlatform().isEmpty()) {
            return ("Game platform cannot be null or empty");
        } else if (game.getReleaseDate() == null || game.getReleaseDate().isEmpty()) {
            return ("Game release date cannot be null or empty");
        } else if (game.getDeveloper() == null || game.getDeveloper().isEmpty()) {
            return ("Game developer cannot be null or empty");
        } else if (game.getPublisher() == null || game.getPublisher().isEmpty()) {
            return ("Game publisher cannot be null or empty");
        } else if (game.getDescription() == null || game.getDescription().isEmpty()) {
            return ("Game description cannot be null or empty");
        } else if (game.getCoverImageUrl() == null || game.getCoverImageUrl().isEmpty()) {
            return ("Game cover image URL cannot be null or empty");
        } else if (game.getMetaCriticRating() < 0 || game.getMetaCriticRating() > 100) {
            return ("MetaCritic rating must be between 0 and 100");
        } else if (game.getUserRating() < 0 || game.getUserRating() > 10) {
            return ("User rating must be between 0 and 10");
        } else if (game.getIsCompleted() == null) {
            return ("Completion status cannot be null");
        } else if (game.getPlaytimeHours() < 0) {
            return ("Playtime hours cannot be negative");
        } else {
            return null; // All validations passed
        }
    }

    public void createGame(Game game) {
        // Implementation for creating a game
        gameRepository.save(game);
    }

}
