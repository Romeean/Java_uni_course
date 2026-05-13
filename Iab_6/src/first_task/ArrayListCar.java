package first_task;

import clasess.CarInformation;

import java.awt.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ArrayListCar extends AbstractList<CarInformation> {
  ArrayList<CarInformation> arr = new ArrayList<>();

  @Override
  public int size() {
    return this.arr.size();
  }

  @Override
  public CarInformation get(int index) {
    return this.arr.get(index);
  }

  public int indexOf(CarInformation carInformation){
    return arr.indexOf(carInformation);
  }

  public ArrayListCar snapshot(int start, int end){
    if(start < 0){
      throw new IllegalArgumentException("Позицiя старту не може бути менше за нуль.");
    }
    if(end >= arr.size()){
      throw new IllegalArgumentException("Позицiя кiнця не може дорiвнювати розмiру ArrayListCar або бiльше.");
    }
    if(start > end){
      throw new IllegalArgumentException("Позицiя старту не може бути бiльшою за позицiю кiнця.");
    }
    ArrayListCar snapshot = new ArrayListCar();
    List<CarInformation> subArr = arr.subList(start, end + 1);

    snapshot.arr.addAll(subArr);

    return snapshot;
  }

  @Override
  public boolean add(CarInformation car){
    return this.arr.add(car);
  }

  public void foreach(){
    for(int i = 0; i < arr.size(); i++){
      CarInformation car = arr.get(i);
      car.print();
    }
  }

  @Override
  public void sort(Comparator<? super CarInformation> comparator){
    arr.sort(comparator);
  }

  @Override
  public CarInformation remove(int index){
    if(index >= arr.size()){
      throw new IllegalArgumentException("Iндекс видалення не може бути більше за розмір массиву, або дорівнювати йому.");
    }
    if(index < 0){
      throw new IllegalArgumentException("Iндекс не може набувати від'ємних значень.");
    }

    return arr.remove(index);
  }

  public boolean remove(CarInformation c){
    if (c == null) {
      throw new IllegalArgumentException("Об'єкт не може бути null.");
    }
    if (!arr.contains(c)) {
      throw new IllegalArgumentException("Такого об'єкту немає в масиві.");
    }

    return arr.remove(c);
  }


}
