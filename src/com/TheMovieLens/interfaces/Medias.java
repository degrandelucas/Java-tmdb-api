package com.TheMovieLens.interfaces;

import java.util.List;

public interface Medias {

    List<String> getTitles();

    List<String> getPosterPaths();

    List<Double> getVoteAverage();

    List<String> getReleaseYear();
}
