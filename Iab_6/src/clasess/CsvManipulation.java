package clasess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;

public class CsvManipulation {

  public static CarInformation createCarInformation(String[] data ){

    double milesPerGallon = Double.parseDouble(data[0]);
    int cylinders = Integer.parseInt(data[1]);
    double displacement = Double.parseDouble(data[2]);
    int horsePower = Integer.parseInt(data[3]);
    double weight = Double.parseDouble(data[4]);
    double acceleration = Double.parseDouble(data[5]);
    int year = Integer.parseInt(data[6]);
    int origin = Integer.parseInt(data[7]);
    String name = data[8];

    return new CarInformation( milesPerGallon,cylinders, displacement, horsePower,
            weight, acceleration, year, origin, name );

  }


  public static void CsvReader(String fileName, Collection<CarInformation> collection){
    boolean isSecondLine = false;

    try {
      BufferedReader bf = new BufferedReader(new FileReader(fileName));

      String line;

      while((line = bf.readLine()) != null){

        if(isSecondLine){
          line = line.replaceAll("\"", "");
          String[] data = line.split(",");

          CarInformation car = createCarInformation(data);
          collection.add(car);

        } else {
          isSecondLine = true;
        }
      }

    } catch (Exception e){
        System.out.println("Exception:" + e.getMessage());
    }
  }
}
