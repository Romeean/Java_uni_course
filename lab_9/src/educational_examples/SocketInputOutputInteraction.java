package educational_examples;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketInputOutputInteraction{

  public static void main(String[] args) throws Exception {
    int c;

    Socket socket = new Socket("whois.internic.net", 43);

    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();

    String path = args.length == 0 ? "google.com" : args[0];

    byte[] buff;
    buff = (path + "\n").getBytes();

    out.write(buff);
    while((c = in.read()) != -1){
      System.out.print((char) c);
    }
  }
}



