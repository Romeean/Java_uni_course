package educational_examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class RequestHTTP {

  public static void main(String[] args) throws Exception {
    String path = args.length == 0 ? "google.com" :  args[0];

    Socket socket = new Socket(path, 80);

    PrintStream out = new PrintStream(socket.getOutputStream());
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out.print("GET / HTTP/1.1\r\n");
    out.print("Host: " + path + "\r\n");
    out.print("Connection: close\r\n");
    out.print("\r\n");
    out.flush();

    String line;
    while( (line = in.readLine()) != null ){
      System.out.print(line);
    }

    in.close();
    out.close();
    socket.close();
  }

}