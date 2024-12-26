package com.TheMovieLens.dto;

import java.util.List;

public record MoviesDto(String original_title, String title, String release_date, Double vote_average) {
}
