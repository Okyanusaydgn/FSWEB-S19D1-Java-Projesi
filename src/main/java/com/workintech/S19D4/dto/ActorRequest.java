package com.workintech.S19D4.dto;

import com.workintech.S19D4.entity.Actor;
import com.workintech.S19D4.entity.Movie;
import lombok.Data;

import java.util.List;

@Data
public class ActorRequest {
    private List<Movie> movies;
    private Actor actor;
}
