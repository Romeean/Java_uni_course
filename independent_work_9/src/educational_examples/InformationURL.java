package educational_examples;

import java.net.MalformedURLException;
import java.net.URL;

public class InformationURL {

  public static void main(String[] args) throws MalformedURLException {

    URL url = new URL("https://www.ukr.net/ru/news/main.html");
    System.out.println("Protocol: " + url.getProtocol());
    System.out.println("Host: " + url.getHost());
    System.out.println("File: " + url.getFile());
    System.out.println("Port: " + url.getPort());
    System.out.println("Ext: "  + url.toExternalForm());

  }
}


