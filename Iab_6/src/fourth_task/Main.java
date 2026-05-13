package fourth_task;

import clasess.CarInformation;
import clasess.CsvManipulation;
import clasess.comparators.CompareWeight;

public class Main {
  public static void main(){
    String path = "C:\\Auto.csv";
    HashSetCar hashSetCar = new HashSetCar();
    CsvManipulation.CsvReader(path, hashSetCar);

    CarInformation newCar = new CarInformation(100.0, 4, 124.1,
            200, 3489, 10, 1980, 4, "qwertyCar");

    // дозволяється визначити наявність елементу у множині;
    hashSetCar.contains(newCar);

    // дозволяється додати новий об’єкт у множину;
    hashSetCar.add(newCar);

    // дозволяється видалити об’єкт з множини;
    hashSetCar.remove(newCar);

    // послідовно виводяться дані із множини
    hashSetCar.print();

    // дозволяється визначити хешкод певного елементу;
    hashSetCar.add(newCar);
    int hashCode = hashSetCar.getHashCode(newCar);

    // дозволяється повернути множину у форматі масиву;
    hashSetCar.toArray();

    // виконати сортування елементів множини за заданим критерієм
    hashSetCar.sort(new CompareWeight());

  }
}
