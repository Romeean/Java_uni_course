package fifth_task;

import clasess.CarInformation;
import clasess.comparators.CompareMPG;

import java.util.Comparator;
import java.util.TreeSet;

public class SortedSetCar extends TreeSet<CarInformation> {
  TreeSet<CarInformation> treeSetCar = new TreeSet<>(new CompareMPG());

  @Override
  public int size() {
    return treeSetCar.size();
  }

  @Override
  public boolean add(CarInformation car) {
    return treeSetCar.add(car);
  }

  public boolean contains(CarInformation car) {
    return treeSetCar.contains(car);
  }

  public boolean remove(CarInformation car) {
    return treeSetCar.remove(car);
  }

  public CarInformation getFirst() {
    return treeSetCar.first();
  }

  public CarInformation getLast() {
    return treeSetCar.last();
  }

  public void print() {
    for (CarInformation c : treeSetCar) {
      c.print();
    }
  }

  public void sort(Comparator<? super CarInformation> comparator) {
    TreeSet<CarInformation> sortedSet = new TreeSet<>(comparator);
    sortedSet.addAll(treeSetCar);
    treeSetCar = sortedSet;
  }
}