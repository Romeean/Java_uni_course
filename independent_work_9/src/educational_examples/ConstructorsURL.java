package educational_examples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ConstructorsURL {

  public static void main(String[] args) throws MalformedURLException, IOException {

    URL url = new URL("https://www.ukr.net");

    URL url1 = new URL("https", "cppreference.com", 443, "/cpp/utility#Swap");
    System.out.print(url1.getAuthority());

    URL url2 = new URL("https", "cppreference.com", "/cpp/utility#Swap");
    System.out.println(url2.getAuthority());

    URL url3 = new URL(url, "/ru/news/main.html");
    URL url4 = new URL(url, "/ru/news/main.html", null);


    int url1HashCode = url1.hashCode();
    int url2HashCode = url2.hashCode();

    if(url1HashCode == url2HashCode){
      System.out.println("They are equal(int hashcode)!");
    }

    if(url1.equals(url2)){
      System.out.println("They are equal(method equals)!");
    }

  }

}
