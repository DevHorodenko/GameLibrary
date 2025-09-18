package com.horodenko.gamelibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horodenko.gamelibrary.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}