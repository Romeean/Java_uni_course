package second_task;

import clasess.CarInformation;
import clasess.CsvManipulation;
import clasess.comparators.CompareCylinders;
import clasess.comparators.CompareHorsePower;

public class Main {
  public static void main(String[] args){
    String path = "C:\\Auto.csv";
    LinkedListCar linkedListCar = new LinkedListCar();
    CsvManipulation.CsvReader(path, linkedListCar);

    // послідовно виводяться дані зі списку у прямому та зворотному
    // порядку;
    linkedListCar.print();
    linkedListCar.printReversed();

    // дозволяється визначити перший та останній елементи у списку;
    CarInformation first = linkedListCar.getFirst();
    CarInformation last = linkedListCar.getLast();

    // дозволяється повернути об’єкт зі списку за певним індексом
    CarInformation certainCar = linkedListCar.get(10);

    // дозволяється визначити індекс заданого об’єкту у списку;
    int index = linkedListCar.indexOf(certainCar);

    // дозволяється отримати набір елементів у вигляді окремого
    // списку, що знаходяться у списку між індексами start та end;
    LinkedListCar linkedListSnapshot = linkedListCar.subList(0, 6);

    // дозволяється виконати сортування за допомогою певного
    // компаратора та виведенням результату сортування;
    linkedListCar.sort(new CompareCylinders());
    linkedListCar.print();

    // дозволяється додати новий об’єкт у початок або у кінець списку
    CarInformation newCar = new CarInformation(100.0, 4, 124.1,
            200, 3489, 10, 1980, 4, "qwertyCar");
    linkedListSnapshot.addFirst(newCar);
    linkedListSnapshot.addLast(newCar);

    // дозволяється видалити об’єкт зі списку за його індексом або за
    // його значенням.
    linkedListSnapshot.remove(0);
    linkedListSnapshot.remove(newCar);


  }
}
