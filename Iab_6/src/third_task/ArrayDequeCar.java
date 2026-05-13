package third_task;

import clasess.CarInformation;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayDequeCar extends ArrayDeque<CarInformation> {
  ArrayDeque<CarInformation> arrayDeque = new ArrayDeque<>();

  @Override
  public boolean add(CarInformation c){
    return arrayDeque.add(c);
  }

  @Override
  public CarInformation getLast(){
    return arrayDeque.getLast();
  }

  @Override
  public CarInformation getFirst(){
    return arrayDeque.getFirst();
  }

  @Override
  public int size(){
    return arrayDeque.size();
  }

  @Override
  public void addLast(CarInformation c){
    arrayDeque.addLast(c);
  }

  @Override
  public void addFirst(CarInformation c){
    arrayDeque.addFirst(c);
  }

  public void print(){
    for(CarInformation car : arrayDeque){
      car.print();
    }
  }

  public void printReversed(){
    Iterator<CarInformation> iterator = arrayDeque.descendingIterator();
    while(iterator.hasNext()){
      CarInformation car = iterator.next();
      car.print();
    }
  }

  public void drain() {
    try {
      while (true) {
        CarInformation car = arrayDeque.removeFirst();
      }
    } catch (NoSuchElementException e) {
      System.out.println("Черга порожня");
    }
  }

  public void removeFirst(CarInformation c){
    arrayDeque.removeFirstOccurrence(c);
  }

  public void removeLast(CarInformation c){
    arrayDeque.removeLastOccurrence(c);
  }


}
