package com.TheMovieLens.connection;

import com.TheMovieLens.dto.MoviesDto;
import com.TheMovieLens.models.APITreatment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Conversion {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static APITreatment conversionFromJson(String responseBodyAPI) {
        return gson.fromJson(responseBodyAPI, APITreatment.class);
    }

    public static String conversionToJson(APITreatment objectsAPITreatment) {
        return gson.toJson(objectsAPITreatment);
    }

}
