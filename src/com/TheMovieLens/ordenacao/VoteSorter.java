package com.TheMovieLens.ordenacao;

import com.TheMovieLens.dto.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class VoteSorter {
    public List<Movie> sortByVote(List<Movie> movies){
        return movies.stream().sorted(Comparator.comparing(Movie::voteAverage).reversed()).collect(Collectors.toList());
    }
}
