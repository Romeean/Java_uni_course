package educational_examples;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class URLConnectionHandMade {

  public static void main(String[] args) throws MalformedURLException, IOException {
    URL url = new URL("https://www.google.com/");
    URLConnection urlConnection = url.openConnection();


    long date = urlConnection.getDate();
    if(date == 0){
      System.out.println("Date is inaccessible :(");
    } else {
      System.out.println("Date: " + new Date(date));
    }

    long dateExpiration = urlConnection.getExpiration();
    if(dateExpiration == 0){
      System.out.println("Expiration date is inaccessible :(");
    } else {
      System.out.println("Date Expiration: " + new Date(dateExpiration));
    }

    long dateLastModified = urlConnection.getLastModified();
    if(dateLastModified == 0){
      System.out.println("Date when last time modified is inaccessible :(");
    } else {
      System.out.println("Date when last time modified: " + new Date(dateLastModified));
    }

    long contentLengthLong = urlConnection.getContentLengthLong();
    if(contentLengthLong == -1){
      System.out.println("Content length is inaccessible :(");
    } else {
      System.out.println("Content length: " + contentLengthLong);

      int c = 0;
      InputStream inputStream = urlConnection.getInputStream();
      while((c = inputStream.read()) != -1){
        System.out.print((char)c);
      }

    }

    Map<String, List<String>> headers = urlConnection.getHeaderFields();
    headers.forEach((header, list) -> {System.out.println(header + " " + list);});

    System.out.println();
    System.out.println(urlConnection.getHeaderField("cache-control"));
    System.out.println(urlConnection.getHeaderField("etag"));
    System.out.println(urlConnection.getHeaderField("last-modified"));


  }

}
