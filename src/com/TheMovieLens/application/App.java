package com.TheMovieLens.application;

import com.TheMovieLens.connection.Connection;

public class App {
    public static void main(String[] args) {
        System.out.println("Segue lista de Filmes mais Populares do momento");
        String teste = Connection.connection();
        System.out.println(teste);
    }
}