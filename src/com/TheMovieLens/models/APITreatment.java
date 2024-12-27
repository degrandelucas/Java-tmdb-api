package com.TheMovieLens.models;

import com.TheMovieLens.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class APITreatment {
    private int page;
    private List<Movie> results; //results e o nome do array de resultados dos filmes na API
    private List<String> titleListMovies = new ArrayList<>();
    private List<String> posterListURL = new ArrayList<>();

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    // Metodos para obter os titulos e os caminhos dos posteres, substituindo os metodos criados com forEach
    public List<String> getTitles() {
        return results.stream().map(Movie::title).toList();  // Extrai os títulos dos filmes
    }

    public List<String> getPosterPaths() {
        return results.stream().map(Movie::posterPath).toList();  // Extrai os caminhos dos pôsteres
    }

    @Override
    public String toString() {
        return "APITreatment{" +
                "page=" + page +
                ", movies=" + results +
                '}';
    }
}
