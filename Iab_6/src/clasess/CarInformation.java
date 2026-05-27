package clasess;
import java.util.Objects;


public class CarInformation {
  private double milesPerGallon; // 1 галон = 3,78 лiтра
  private int cylinders;
  private double displacement; // об'єм двигуна 1 куб дюйм = 16,35 куб см
  private int horsepower;
  private double weight;
  private double acceleration; // 1 миля = 1,6 км
  private int year;
  private int origin;
  private String name;


  public CarInformation(double mpg, int c, double d, int h, double w, double a, int y, int o, String n){
    this.milesPerGallon = mpg;
    this.cylinders = c;
    this.displacement = d;
    this.horsepower = h;
    this.weight = w;
    this.acceleration = a;
    this.year = y;
    this.origin = o;
    this.name = n;
  }

  public void setMilesPerGallon(double milesPerGallon) {
    this.milesPerGallon = milesPerGallon;
  }
  public double getMilesPerGallon() {
    return milesPerGallon;
  }

  public void setCylinders(int cylinders) {
    this.cylinders = cylinders;
  }
  public int getCylinders(){
    return cylinders;
  }

  public void setDisplacement(int displacement) {
    this.displacement = displacement;
  }
  public double getDisplacement() {
    return displacement;
  }

  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }
  public int getHorsepower() {
    return horsepower;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
  public double getWeight() {
    return weight;
  }

  public double getAcceleration() {
    return acceleration;
  }
  public void setAcceleration(int acceleration) {
    this.acceleration = acceleration;
  }

  public void setYear(int year) {
    this.year = year;
  }
  public int getYear() {
    return year;
  }

  public void setOrigin(int origin) {
    this.origin = origin;
  }
  public int getOrigin() {
    return origin;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void print(){
    System.out.println("Miles Per gallon: " + milesPerGallon);
    System.out.println("Cylinders: " + cylinders);
    System.out.println("Displacement: " + displacement);
    System.out.println("Horse power: " + horsepower);
    System.out.println("Weight: " + weight);
    System.out.println("Acceleration: " + acceleration);
    System.out.println("Year: " + year);
    System.out.println("Origin: " + origin);
    System.out.println("Name: " + name);

    System.out.println();
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;

    if(o == null || this.getClass() != o.getClass()) return false;

    CarInformation car = (CarInformation) o;

    return
      this.getMilesPerGallon() == car.getMilesPerGallon() &&
      this.getCylinders()      == car.getCylinders()      &&
      this.getDisplacement()   == car.getDisplacement()   &&
      this.getHorsepower()     == car.getHorsepower()     &&
      this.getWeight()         == car.getWeight()         &&
      this.getAcceleration()   == car.getAcceleration()   &&
      this.getYear()           == car.getYear()           &&
      this.getOrigin()         == car.getOrigin()         &&
      Objects.equals(this.getName(), car.getName());
  }


  @Override
  public String toString(){
    return (
      "MilesPerGallon: " + milesPerGallon + "\n" +
      "Cylinders: " + cylinders + "\n" +
      "Displacement: " + displacement + "\n" +
      "horsepower: " + horsepower + "\n" +
      "weight: " + weight + "\n" +
      "year: " + year + "\n" +
      "origin: " + origin + "\n" +
      "name: " + name + "\n" + "\n"
    );
  }


  @Override
  public int hashCode(){
    return Objects.hash(getMilesPerGallon(), getCylinders(),
      getDisplacement(), getHorsepower(), getWeight(), getAcceleration(),
      getYear(), getOrigin(), getName()
    );
  }
}
