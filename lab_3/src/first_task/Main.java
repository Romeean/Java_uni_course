package first_task;

public class Main {
  public static void main(String[] args){
    if(args.length != 2){
      System.err.println("Функцiя приймає на вхiд лише 2 агрументи");
    }

    String value_1 = args[0];
    String value_2 = args[1];
    int steps = Integer.parseInt(value_1);
    int moveSpeeed = Integer.parseInt(value_2);

    if(steps < 0){
      System.err.println("Значення steps не може набувати від'ємних значень");
    }
    if(moveSpeeed < 0){
      System.err.println("Значення moveSpeed не може набувати від'ємних значень");
    }

    Point point = new Point(1, 1);

    Vehicle car = new Vehicle("Sedan", "BMV", 2026, 3.10,
            point, moveSpeeed, 20
    );

    System.out.println("x: " + car.getPoint().getX() + " " + "y: " + car.getPoint().getY());
    car.moveTo(Direction.Right, steps);
    System.out.println("x: " + car.getPoint().getX() + " " + "y: " + car.getPoint().getY());
    System.out.println("Кiлькiсть пального: " + car.getFuel());
  }
}
