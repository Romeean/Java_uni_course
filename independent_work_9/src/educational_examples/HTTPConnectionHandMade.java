package educational_examples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HTTPConnectionHandMade {
  public static void main(String[] args) throws MalformedURLException, IOException {

    URL url = new URL("http://www.education.zp.ua/");
    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

    System.out.println("Request method:  " + httpURLConnection.getRequestMethod());
    System.out.println("Response code: " + httpURLConnection.getResponseCode());
    System.out.println("Response Message : " + httpURLConnection.getResponseMessage());
    System.out.println();

    Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
    headers.forEach((header, list) -> {System.out.println(header + list);});
    System.out.println();

  }
}
