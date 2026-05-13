package clasess.comparators;

import clasess.CarInformation;
import java.util.Comparator;

public class CompareAcceleration implements Comparator<CarInformation> {
  @Override
  public int compare(CarInformation c1, CarInformation c2){
    return Double.compare(c1.getAcceleration(), c2.getAcceleration());
  }
}
