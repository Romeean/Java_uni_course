package fifth_task;

import clasess.CsvManipulation;
import clasess.comparators.CompareName;

public class Main {
  public static void main(String[] args) {
    String path = "C:\\Auto.csv";

    SortedSetCar treeSetCar = new SortedSetCar();
    CsvManipulation.CsvReader(path, treeSetCar);

    treeSetCar.sort(new CompareName());

  }
}