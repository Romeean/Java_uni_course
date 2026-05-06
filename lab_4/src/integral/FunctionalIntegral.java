package integral;

abstract class FunctionalIntegral {
  private double a;
  private double b;

  FunctionalIntegral(double a, double b){
    if (a > b) {
      throw new IllegalArgumentException("Ліва межа не може бути більшою за праву");
    }

    this.a = a;
    this.b = b;
  }

  public double getA(){ return this.a; }
  public double getB(){ return this.b; }


  abstract double simpson();
  abstract double rectangle();
  abstract double trapezoid();
  abstract double f(double x);

}
