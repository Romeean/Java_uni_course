package clasess.comparators;

import clasess.CarInformation;
import java.util.Comparator;

public class CompareDisplacement implements Comparator<CarInformation> {
  @Override
  public int compare(CarInformation c1, CarInformation c2){
    return Double.compare(c1.getDisplacement(), c2.getDisplacement());
  }
}
