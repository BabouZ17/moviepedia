package com.example.moviepedia.Movie;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Movie {
    @Id
    private String id;

    @Indexed(unique = true)
    @NonNull
    private String title;

    @NonNull
    private String director;

    private List<String> actors;
    private List<String> photos;

    private Integer likes;
    private Integer dislikes;

    @NonNull
    private LocalDate releaseDate;
}
