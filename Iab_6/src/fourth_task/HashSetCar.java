package fourth_task;

import clasess.CarInformation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class HashSetCar extends HashSet<CarInformation> {
  HashSet<CarInformation> hashSetCar = new HashSet<>();

  @Override
  public int size(){
    return hashSetCar.size();
  }

  @Override
  public boolean add(CarInformation car){
    return hashSetCar.add(car);
  }

  public boolean contains(CarInformation car){
    return hashSetCar.contains(car);
  }

  public boolean remove(CarInformation car) {
    return super.remove(car);
  }

  public void print(){
    for(CarInformation c : hashSetCar){
      c.print();
    }
  }

  public int getHashCode(CarInformation c){
    if(hashSetCar.contains(c)){
      return c.hashCode();
    }

    throw new NoSuchElementException("Цього елементу немає в множинi");
  }

  @Override
  public CarInformation[] toArray() {
    return hashSetCar.toArray(new CarInformation[0]);
  }

  public void sort(Comparator<? super CarInformation> comparator){
    ArrayList<CarInformation> carList = new ArrayList<>(hashSetCar);
    carList.sort(comparator);

    for(CarInformation c : carList){
      c.print();
    }
  }

}
