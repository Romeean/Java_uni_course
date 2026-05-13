package clasess.comparators;

import clasess.CarInformation;
import java.util.Comparator;

public class CompareHorsePower implements Comparator<CarInformation> {
  @Override
  public int compare(CarInformation c1, CarInformation c2){
    return c1.getHorsepower() - c2.getHorsepower();
  }
}
