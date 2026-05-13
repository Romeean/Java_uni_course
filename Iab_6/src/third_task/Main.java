package third_task;

import clasess.CarInformation;
import clasess.CsvManipulation;

public class Main {
  public static void main(String[] args){
    String path = "C:\\Auto.csv";
    ArrayDequeCar arrayDequeCar = new ArrayDequeCar();
    CsvManipulation.CsvReader(path, arrayDequeCar);

    // дозволяється визначити перший та останній елементи у черзі;
    CarInformation first = arrayDequeCar.getFirst();
    CarInformation last = arrayDequeCar.getLast();

    // дозволяється додати новий об’єкт у початок або у кінець списку;
    CarInformation newCar = new CarInformation(100.0, 4, 124.1,
            200, 3489, 10, 1980, 4, "qwertyCar");
    arrayDequeCar.addFirst(newCar);
    arrayDequeCar.addLast(newCar);

    // послідовно виводяться дані із черги у прямому та зворотному
    // порядку;
    arrayDequeCar.print();
    arrayDequeCar.printReversed();

    // використовується виключення NoSuchElementException для
    // завершення дії вибирання елементів із черги;
    arrayDequeCar.drain();

    // дозволяється видалити перший знайдений об’єкт зі списку за
    // його значенням;
    arrayDequeCar.removeFirst();

    // дозволяється видалити останній знайдений об’єкт зі списку за
    // його значенням
    arrayDequeCar.removeLast();



  }
}
