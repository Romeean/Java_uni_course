package integral;

public class ExponentialFunction extends FunctionalIntegral {
  private final double c1;

  public ExponentialFunction(double a, double b, double c1){
    super(a, b);
    this.c1 = c1;
  }

  @Override
  public double f(double x){
    return Math.pow(2, x) + c1;
  }
}
