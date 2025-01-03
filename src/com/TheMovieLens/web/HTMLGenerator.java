package com.TheMovieLens.web;

import com.TheMovieLens.models.APITreatment;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class HTMLGenerator {
    private PrintWriter writer;

    public HTMLGenerator(PrintWriter writer) {
        this.writer = writer;
    }

    //metodo para gerar o html
    public void generateHtml(APITreatment apiTreatment) {
        // Lista de titulos, posteres, notas e anos dos filmes
        List<String> titles = apiTreatment.getTitles();
        List<String> posterPaths = apiTreatment.getPosterPaths();
        List<Double> votes = apiTreatment.getVoteAverage();
        List<String> year = apiTreatment.getReleaseYear();

        // Obtem a data do dia no formato desejado abaixo
        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Cabecalho do HTML
        writer.println("<html>");
        String head =
                """
                        <head>
                            <meta charset=utf-8>
                            <meta name=viewport content=width=device-width, initial-scale=1, shrink-to-fit=no>
                            <title>Filmes Populares</title>
                            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
                                + "integrity=sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm crossorigin=anonymous>
                        </head>
                """;
        writer.println(head);
        writer.println("<body>");
        writer.println("<h1 class='text-center'>Filmes Mais Populares em " + formattedDate + "</h1>");

        // Adiciona os filmes ao HTML
        for (int i = 0; i < titles.size(); i++) {

            String movieTemplate = """
                    <div class="card mb-3 card text-center img-center">
                    <div class="card-body">
                    <h2 class="card-title"> %s </h2>
                    <img class="card-img-top" src='https://image.tmdb.org/t/p/w200%s alt='Poster' style='width:20rem'>
                    <div class="container inner cover">
                    <div class="row justify-content-md-center">
                    <div class="col-md-auto">
                    <p card-text><strong>Nota:</strong> %.1f </p>
                    </div>
                    <div class="col-md-auto">
                    <p card-text><strong>Ano:</strong> %s </p>
                    </div>
                    </div></div>
                    </div>
                    </div>
                    """;

            writer.println(String.format(movieTemplate,
                    titles.get(i),
                    posterPaths.get(i),
                    votes.get(i),
                    year.get(i)));
        }

        // Fechamento do HTML
        writer.println("</body>");
        writer.println("</html>");

    }
}
