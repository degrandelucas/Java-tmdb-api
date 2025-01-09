package com.TheMovieLens.ordenacao;

import com.TheMovieLens.dto.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class YearSorter {
    public List<Movie> sortByYear(List<Movie> movies){
        return movies.stream().sorted(Comparator.comparing(Movie::releaseDate).reversed()).collect(Collectors.toList());
    }
}
