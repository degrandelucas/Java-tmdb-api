package com.TheMovieLens.models;

import com.TheMovieLens.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class APITreatment {
    private int page;
    private List<Movie> results; //results e o nome do array de resultados dos filmes na API

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    // Metodos para obter os titulos e os caminhos dos posteres, substituindo os metodos criados com forEach
    public List<String> getTitles() {
        return results.stream().map(Movie::title).toList();
    }

    public List<String> getPosterPaths() {
        return results.stream().map(Movie::posterPath).toList();
    }

    public List<Double> getVoteAverage() {
        return results.stream().map(Movie::voteAverage).toList();
    }

    public List<Integer> getReleaseYear() {
        return results.stream().map(Movie::releaseYear).toList();
    }


    @Override
    public String toString() {
        return "Movie Lens: {" +
                "page=" + page +
                ", movies=" + results +
                '}';
    }
}
