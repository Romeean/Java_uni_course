package integral;

abstract class FunctionalIntegral {
  private double a;
  private double b;

  FunctionalIntegral(double a, double b){
    this.a = a;
    this.b = b;
  }

  public double getA(){
    return this.a;
  }
  public double getB(){
    return this.b;
  }
  public void setA(double a){
    this.a = a;
  }
  public void setB(double b){
    this.b = b;
  }

  abstract double simpson();
  abstract double rectangle();
  abstract double trapezoid();

}
