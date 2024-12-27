package com.TheMovieLens.models;

import com.TheMovieLens.dto.MoviesDto;

import java.util.List;

public class APITreatment {
    private int page;
    private List<MoviesDto> results; //results e o nome do array de resultados dos filmes na API

    public void setResults(List<MoviesDto> results) {
        this.results = results;
    }

    public void titleList(){
        System.out.println("Lista de títulos:");
        for (MoviesDto movie : results) {
            System.out.println(movie.title());
        }
    }

    public void posterUrl(){
        System.out.println("Lista dos posters:");
        for (MoviesDto posters : results) {
            System.out.println(posters.poster_path());
        }
    }

    @Override
    public String toString() {
        return "APITreatment{" +
                "page=" + page +
                ", movies=" + results +
                '}';
    }
}
