package theory.DynamicDispatch;

abstract public class Figure {
  private double a;
  private double b;

  Figure(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA(){ return this.a; }
  public double getB(){ return this.b; }


  abstract double area();
}
