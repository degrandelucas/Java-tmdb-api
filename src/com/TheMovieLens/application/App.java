package com.TheMovieLens.application;

import com.TheMovieLens.connection.Connection;
import com.TheMovieLens.connection.Conversion;
import com.TheMovieLens.dto.MoviesDto;
import com.TheMovieLens.models.APITreatment;

public class App {
    public static void main(String[] args) {
        System.out.println("Segue lista de Filmes mais Populares do momento");
        String PopularMoviesFullAPI = Connection.connection(); //teste, realizar o tratamento posteriormente
        System.out.println(PopularMoviesFullAPI);

        //Campos que queremos manter no resultado
        APITreatment chooseFieldsMovies = Conversion.conversionFromJson(PopularMoviesFullAPI);
        System.out.println(chooseFieldsMovies);

        String teste = Conversion.conversionToJson(chooseFieldsMovies);
        System.out.println(teste);


        //Converter a string obtida da API JSON para um JsonArray
        //JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();


    }
}