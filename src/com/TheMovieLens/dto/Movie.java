package com.TheMovieLens.dto;

import com.google.gson.annotations.SerializedName;

public record Movie(
        String title,
        @SerializedName("original_title") String originalTitle,
        @SerializedName("poster_path") String posterPath,
        @SerializedName("vote_average") double voteAverage,
        @SerializedName("release_date") String releaseDate // Este é calculado, entao nao precisa do mapeamento
) {
    public Movie(String title, String originalTitle, String posterPath, double voteAverage, String releaseDate) {
        this.title = title;
        this.posterPath = posterPath;
        this.originalTitle = originalTitle;
        this.voteAverage = voteAverage;
        this.releaseDate = releaseDate.substring(0,4);

    }
}