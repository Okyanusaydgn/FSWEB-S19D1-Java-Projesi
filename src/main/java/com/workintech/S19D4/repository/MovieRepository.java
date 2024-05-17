package com.workintech.S19D4.repository;

import com.workintech.S19D4.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Long> {


}
