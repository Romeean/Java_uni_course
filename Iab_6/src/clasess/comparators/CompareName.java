package clasess.comparators;

import clasess.CarInformation;
import java.util.Comparator;

public class CompareName implements Comparator<CarInformation> {
  @Override
  public int compare(CarInformation c1, CarInformation c2){
    return c1.getName().compareTo(c2.getName());
  }
}
