package clasess.comparators;

import clasess.CarInformation;
import java.util.Comparator;


public class CompareMPG implements Comparator<CarInformation> {
  @Override
  public int compare(CarInformation c1, CarInformation c2){
    return Double.compare(c1.getMilesPerGallon(), c2.getMilesPerGallon());
  }
}
