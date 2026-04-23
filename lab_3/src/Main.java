import first_task.Point;
import first_task.Vehicle;
import first_task.Direction;
import first_task.Vehicle;

class Main {
  public static void main(String[] args){
    Point point = new Point(1, 1);

    Vehicle car = new Vehicle("Sedan", "BMV", 2026, 3.10,
            point, 3, 20
    );

    System.out.println("x: " + car.getPoint().getX() + " " + "y: " + car.getPoint().getY());
    car.moveTo(Direction.Right, 10);
    System.out.println("x: " + car.getPoint().getX() + " " + "y: " + car.getPoint().getY());

  }
}
