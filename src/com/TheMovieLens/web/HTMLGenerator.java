package com.TheMovieLens.web;

import com.TheMovieLens.models.APITreatment;

import java.io.PrintWriter;
import java.util.List;

import static java.lang.String.format;

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

        // Cabecalho do HTML
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Filmes Populares</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Filmes Mais Populares</h1>");

        // Adiciona os filmes ao HTML
        for (int i = 0; i < titles.size(); i++) {

            writer.println(format("""
                    <div style='margin-bottom: 20px;'>
                    <h2> %s </h2>
                    <img src='https://image.tmdb.org/t/p/w200+ %s alt='Poster' style='width:200px;'>
                    <p><strong>Nota:</strong>  %d </p>
                    <p><strong>Ano:</strong> %s </p>
                    """,
                    titles.get(i),
                    posterPaths.get(i),
                    votes.get(i),
                    year.get(i)));

            writer.println("<div style='margin-bottom: 20px;'>");
            writer.println("<h2>" + titles.get(i) + "</h2>");
            writer.println("<img src='https://image.tmdb.org/t/p/w200" + posterPaths.get(i) + "' alt='Poster' style='width:200px;'>");
            writer.println("<p><strong>Nota:</strong> " + votes.get(i) + "</p>");
            writer.println("<p><strong>Ano:</strong> " + year.get(i) + "</p>");
            writer.println("</div>");

        }

        // Fechamento do HTML
        writer.println("</body>");
        writer.println("</html>");

    }
}
