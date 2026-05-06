package theory.PolimorficDispatch;

public class Figure {
  private double a;
  private double b;

  Figure(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA(){ return this.a; }
  public double getB(){ return this.b; }


  double area(){
    System.out.println("Площа для figure не існує.");
    return 0;
  };
}
