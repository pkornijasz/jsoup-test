package pl.kornijasz;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class JsoupTest {

    public static void main(String[] args) throws IOException {

        final Document page = Jsoup.connect("https://www.benq.eu/pl-pl/projector/cineprime-home-cinema/w2700/specifications.html").get();

        for (Element searchResult : page.select("div.row.data_row.f_gray")) {
            final String key = searchResult.getElementsByClass("col-md-4 col-sm-6 col-xs-6").text();
            final String value = searchResult.getElementsByClass("col-md-8 col-sm-6 col-xs-6").text();
            System.out.println(key + " -> " + value);

        }
    }
}
