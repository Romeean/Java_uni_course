package educational_examples;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressInteraction {

  public static void main(String[] args) throws UnknownHostException {

    InetAddress address = InetAddress.getLocalHost();
//    System.out.println(address.getHostName());
//    System.out.println(address);
//
//    address = InetAddress.getByName("www.ukr.net");
//    System.out.println(address);

    // --------------------- //

    address = InetAddress.getByName("www.youtube.com");
    System.out.println(address);

    InetAddress[] addresses = InetAddress.getAllByName("www.youtube.com");
    for(int i = 0; i < addresses.length; i++){
      System.out.println(addresses[i]);
    }

    byte[] byteAddress = {(byte)192, (byte)168, (byte)56, (byte)1};
    address = InetAddress.getByAddress(byteAddress);
    System.out.println(address.getHostName());

  }

}