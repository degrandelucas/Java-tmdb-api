package com.TheMovieLens.application;

import com.TheMovieLens.connection.Connection;
import com.TheMovieLens.connection.Conversion;
import com.TheMovieLens.dto.MoviesDto;
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
        
        //Converter a string obtida da API JSON para um JsonArray
        //JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();


    }
}