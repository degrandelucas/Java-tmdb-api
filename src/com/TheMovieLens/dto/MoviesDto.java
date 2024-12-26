package com.TheMovieLens.dto;

public record MoviesDto(String original_title, String title, String release_date, Double vote_average) {

    @Override
    public String toString() {
        return "MoviesDto{" +
                "original_title='" + original_title + '\'' +
                ", title='" + title + '\'' +
                ", release_date='" + release_date + '\'' +
                ", vote_average=" + vote_average +
                '}';
    }
}
