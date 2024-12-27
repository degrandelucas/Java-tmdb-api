package com.TheMovieLens.web;

import com.TheMovieLens.models.APITreatment;

import java.io.PrintWriter;

public class HTMLGenerator {
    private PrintWriter writer;

    public HTMLGenerator(PrintWriter writer) {
        this.writer = writer;
    }

    public void generateHtml(APITreatment apiTreatment) {
    }
}
