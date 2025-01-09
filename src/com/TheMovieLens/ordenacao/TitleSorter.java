package com.TheMovieLens.ordenacao;

import com.TheMovieLens.dto.Movie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TitleSorter {
    public List<Movie> sortByTitle(List<Movie> movies){
        return movies.stream().sorted(Comparator.comparing(Movie::title)).collect(Collectors.toList());
    }
}
