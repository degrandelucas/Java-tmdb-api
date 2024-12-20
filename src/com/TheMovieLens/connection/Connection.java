package com.TheMovieLens.connection;

import com.sun.net.httpserver.Request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Connection {
    String url = "https://api.themoviedb.org/3/movie/popular?language=en-US&page=1";

    HttpClient client = HttpClient.newBuilder().build();

    try{
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                        .header("accept", "application/json")
                        .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIzZjBlNGI4ZmU3YjY1OGE1ZWEzZTA1MjNiOTkyM2NhOSIsIm5iZiI6MTczNDcxOTgzOS4wMTEwMDAyLCJzdWIiOiI2NzY1Yjk1ZjkxOTI4N2VmNTM5MGRiZWMiLCJzY29wZXMiOlsiYXBpX3JlYWQiXSwidmVyc2lvbiI6MX0.KgZKTDzPzzJ9dvT2Np0vsqhI8hIVKxf9OyXE0mUY48s")
                        .GET()
                        .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString()).execute();
    } catch(IOException | InterruptedException e) {
        throw new RuntimeException(e);
    }
    

}
