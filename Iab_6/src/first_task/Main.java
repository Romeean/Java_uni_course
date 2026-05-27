package first_task;
import clasess.CarInformation;
import clasess.CsvManipulation;
import clasess.comparators.CompareHorsePower;

public class Main {
  public static void main(String[] args){
    String path = "C:\\Auto.csv";
    ArrayListCar carArr = new ArrayListCar();
    CsvManipulation.CsvReader(path, carArr);

    // послідовно виводяться данні з ArrayList за допомогою циклу for each;
    carArr.foreach(car -> car.print());

    // дозволяється повернути об’єкт зі списку за певним індексом;
    CarInformation car = carArr.get(10);

    // дозволяється визначити індекс заданого об’єкту у списку;
    int index = carArr.indexOf(car);

    // дозволяється отримати набір елементів у вигляді окремого
    // списку, що знаходяться в ArrayList між індексами start та end;
    ArrayListCar arrSnapshot = carArr.subList(0, 8);

    // дозволяється виконати сортування за допомогою певного
    // компаратора та виведенням результату сортування;
    arrSnapshot.sort(new CompareHorsePower());

    // дозволяється додати новий об’єкт до списку;
    CarInformation newCar = new CarInformation(100.0, 4, 124.1,
            200, 3489, 10, 1980, 4, "qwertyCar");
    arrSnapshot.add(newCar);

    // дозволяється видалити об’єкт зі списку за його індексом або за
    // його значенням.
    arrSnapshot.remove(2);
    arrSnapshot.remove(newCar);

  }
}