package first_task;
import first_task.Direction;

public class Vehicle {
  private String type;
  private String model;
  private int year;
  private double mileage;

  private Point point;
  private int moveSpeed; // количество значений пройденных за 1 шаг
  private double fuel;   // количество топлива

  public Vehicle(String type, String model, int year, double mileage, Point point, int moveSpeed, double fuel){
    this.type = type;
    this.model = model;
    this.year = year;
    this.mileage = mileage;

    this.point = new Point(point.getX(), point.getY());
    this.moveSpeed = moveSpeed;
    this.fuel = fuel;
  }

  public Point getPoint(){
    return this.point;
  }

  public int getMoveSpeed(){
    return this.moveSpeed;
  }
  public void setMoveSpeed(int moveSpeed){
    this.moveSpeed = moveSpeed;
  }

  public double getFuel(){
    return this.fuel;
  }
  public void setFuel(double fuel){
    this.fuel = fuel;
  }

  public void moveTo(Direction direction, int steps){

    if(steps < 0){
      throw new ArithmeticException("Вiдстань не може бути меньшою за нуль");
    }

    int distance = steps * this.getMoveSpeed();
    double updatedFuel = getFuel() - (distance * 0.7);
    if(updatedFuel < 0){
      System.out.println("Недостатння кiлькiсть пального");
    }
    if(updatedFuel > 0){
      switch(direction){
        case Down: {
          this.point.setY(point.getY() - (steps * getMoveSpeed()));
        }
        case Up: {
          this.point.setY(point.getY() + (steps * getMoveSpeed()));
        }
        case Left: {
          this.point.setX(point.getX() - (steps * getMoveSpeed()));
        }
        case Right: {
          this.point.setX(point.getX() + (steps * getMoveSpeed()));
        }

        this.setFuel(updatedFuel);
      }
    }

  }
}
