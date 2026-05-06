package integral;

public class QuadraticFunction extends  FunctionalIntegral {
  private final double c1;
  private final double c2;

  public QuadraticFunction(double a, double b, double c1, double c2){
    super(a, b);
    this.c1 = c1;
    this.c2 = c2;
  }

  @Override
  public double f(double x){
    return c1 * Math.pow(x, 2) + c2;
  }

}