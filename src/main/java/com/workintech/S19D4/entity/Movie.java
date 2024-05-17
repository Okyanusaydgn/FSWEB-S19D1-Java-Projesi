package com.workintech.S19D4.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Table(name = "Movie",schema ="fsweb")
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


    @Column(name = "director_name")
    private String directorName;


    @Column(name = "rating")
    private Integer rating;

    @Column(name = "release_date")
    private LocalDate relaseDate;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "movie_actor",schema = "fsweb", joinColumns=@JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id") )
    private List<Actor> actors;

}
