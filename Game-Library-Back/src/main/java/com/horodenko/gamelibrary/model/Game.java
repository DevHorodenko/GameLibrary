package com.horodenko.gamelibrary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Game {

    @Id
    private Long id;
    private String title;
    private String genre;
    private String platform;
    private String releaseDate;
    private String developer;
    private String publisher;
    private String description;
    private String coverImageUrl;
    private Double metaCriticRating;
    private Double userRating;
    private Boolean isCompleted;
    private Boolean isFavorite;
    private String notes;
    private Double playtimeHours;

}
