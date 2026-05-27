package second_task;

import clasess.CarInformation;
import first_task.ArrayListCar;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListCar extends LinkedList<CarInformation> {
  LinkedList<CarInformation> linkedList = new LinkedList<>();

  @Override
  public boolean add(CarInformation c){
    return linkedList.add(c);
  }

  @Override
  public void addLast(CarInformation c){
    linkedList.addLast(c);
  }

  @Override
  public void addFirst(CarInformation c){
    linkedList.addFirst(c);
  }

  @Override
  public CarInformation get(int index){
    if(index < 0 || index > linkedList.size()){
      throw new IndexOutOfBoundsException("переданий iндекс поза межами масиву");
    }

    return linkedList.get(index);
  }

  @Override
  public int indexOf(Object o){

    CarInformation car = (CarInformation) o;

    if(car == null) {
      throw new IllegalArgumentException("переданий екземпляр має значення null");
    }

    return this.linkedList.indexOf(car);
  }

  @Override
  public CarInformation getFirst(){
    return linkedList.getFirst();
  }

  @Override
  public CarInformation getLast(){
    return linkedList.getLast();
  }

  public void printReversed(){
    CarInformation c;
    for(int i = linkedList.size() - 1; i >= 0; i--){
      c = linkedList.get(i);
      c.print();
    }
  }

  public void print(){
    for(CarInformation c : linkedList) {
      c.print();
    }
  }


  public LinkedListCar subList(int start, int end){
    if(start < 0){
      throw new IllegalArgumentException("Позицiя старту не може бути менше за нуль.");
    }
    if(end >= linkedList.size()){
      throw new IllegalArgumentException("Позицiя кiнця не може дорiвнювати розмiру ArrayListCar або бiльше.");
    }
    if(start > end){
      throw new IllegalArgumentException("Позицiя старту не може бути бiльшою за позицiю кiнця.");
    }
    LinkedListCar sublist = new LinkedListCar();

    for(int i = start; i <= end; i++){
      CarInformation record = linkedList.get(i);
      sublist.linkedList.add(record);
    }

    return sublist;
  }

  @Override
  public void sort(Comparator<? super CarInformation> comparator){
    linkedList.sort(comparator);
  }

  @Override
  public CarInformation remove(int index){
    if(index < 0 || index > linkedList.size()){
      throw new IndexOutOfBoundsException("переданий iндекс поза межами масиву");
    }
    return linkedList.remove(index);
  }

  public boolean remove(CarInformation c) {
    if (c == null) {
      throw new IllegalArgumentException("Об'єкт не може бути null.");
    }
    boolean isExist = linkedList.remove(c);

    if (!isExist) {
      throw new IllegalArgumentException("Такого об'єкту немає.");
    }

    return true;
  }
}
