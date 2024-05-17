package com.workintech.S19D4.service;

import com.workintech.S19D4.entity.Actor;
import java.util.List;


public interface ActorService {
    List<Actor> findAll();
    Actor findById(long id);

    Actor save(Actor actor);

    void delete(Actor actor);
}