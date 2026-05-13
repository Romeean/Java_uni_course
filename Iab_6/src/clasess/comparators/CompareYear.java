package clasess.comparators;

import clasess.CarInformation;
import java.util.Comparator;

public class CompareYear implements Comparator<CarInformation> {
  @Override
  public int compare(CarInformation c1, CarInformation c2){
    return c1.getYear() - c2.getYear();
  }
}
