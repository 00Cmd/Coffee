package com.caffeine.coffee.parser;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

public class HtmlParser {

    public static void getHtml() {
        //TODO: download the document as html and save it to templates dir
        Document doc404 = null;
        try {
            doc404 = Jsoup.connect("https://www.ruled.me/ketoproof-coffee").get();
            String textContent = doc404.select(".entry-content").html();


            BufferedWriter writer = null;
            try {
                String home = System.getProperty("user.home");
                String filename = "file2.html";
                writer = new BufferedWriter(new FileWriter(home+ "/Downloads/coffee2/src/main/resources/templates/" + filename));
                writer.write(textContent);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } catch (HttpStatusException ex) {
            System.out.println("----------- " + ex.getStatusCode() + " -----------");
        } catch (IOException e) {
            System.out.println("----------- " + e.getMessage() + " -----------");
        }
        try {
            assert doc404 != null;
        } catch (NullPointerException ex) {
            System.out.println("--------- " + ex.getLocalizedMessage() + " ---------");
        }
    }
}
