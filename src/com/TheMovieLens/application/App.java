package com.TheMovieLens.application;

import com.TheMovieLens.connection.Connection;
import com.TheMovieLens.connection.Conversion;
import com.TheMovieLens.models.APITreatment;

public class App {
    public static void main(String[] args) {
        System.out.println("Segue lista de Filmes mais Populares do momento");
        String PopularMoviesFullAPI = Connection.connection(); //jsonMoviesDto, realizar o tratamento posteriormente
        System.out.println(PopularMoviesFullAPI);

        //Campos que queremos manter no resultado
        APITreatment TreatmentFieldsMovies = Conversion.conversionFromJson(PopularMoviesFullAPI);
        System.out.println(TreatmentFieldsMovies);

        String jsonMoviesDto = Conversion.conversionToJson(TreatmentFieldsMovies);
        System.out.println(jsonMoviesDto);

        // Exibicao dos titulos e URLs dos posteres
        System.out.println("\nTítulos dos Filmes:");
        TreatmentFieldsMovies.getTitles().forEach(System.out::println);

        System.out.println("\nCaminhos dos Pôsteres:");
        TreatmentFieldsMovies.getPosterPaths().forEach(System.out::println);


        /*
        Metodo para imprimir apenas os titulos dos filmes mais populares
        TreatmentFieldsMovies.titleList();

        Metodo para imprimir apenas o caminho dos posters dos filmes mais populares
       TreatmentFieldsMovies.posterUrl();

        TreatmentFieldsMovies.setTitleListMovies();
        TreatmentFieldsMovies.setPosterListURL();

        System.out.println(TreatmentFieldsMovies.getTitleListMovies());
        System.out.println(TreatmentFieldsMovies.getPosterListURL());
        */
    }
}