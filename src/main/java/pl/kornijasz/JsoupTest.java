package pl.kornijasz;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class JsoupTest {

    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36";

    public static void main(String[] args) throws IOException {

        final Document page = Jsoup.connect("https://www.benq.eu/pl-pl/projector/cineprime-home-cinema/w2700/specifications.html").get();

        for (Element searchResult : page.select("div.row.data_row.f_gray")) {
            final String key = searchResult.getElementsByClass("col-md-4 col-sm-6 col-xs-6").text();
            final String value = searchResult.getElementsByClass("col-md-8 col-sm-6 col-xs-6").text();
            System.out.println(key + " -> " + value);

        }
    }
}
