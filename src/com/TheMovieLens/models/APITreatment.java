package com.TheMovieLens.models;

import com.TheMovieLens.dto.Movie;
import com.TheMovieLens.interfaces.Medias;

import java.util.List;

public class APITreatment implements Medias {
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
    @Override
    public List<String> getTitles() {
        return results.stream().map(Movie::title).toList();
    }

    @Override
    public List<String> getPosterPaths() {
        return results.stream().map(Movie::posterPath).toList();
    }

    @Override
    public List<Double> getVoteAverage() {
        return results.stream().map(Movie::voteAverage).toList();
    }

    @Override
    public List<String> getReleaseYear() {
        return results.stream().map(Movie::releaseDate).toList();
    }

    @Override
    public String toString() {
        return "Movie Lens: {" +
                "page=" + page +
                ", movies=" + results +
                '}';
    }
}
