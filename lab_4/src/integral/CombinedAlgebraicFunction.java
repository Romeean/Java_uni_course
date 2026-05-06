package integral;

public class CombinedAlgebraicFunction extends FunctionalIntegral {
  private final double c1;
  private final double c2;


  public CombinedAlgebraicFunction(double a, double b, double c1, double c2){
    super(a, b);
    this.c1 = c1;
    this.c2 = c2;

    if(b > c1){
      throw new IllegalArgumentException("Межа b (" + b + ") виходить за межi областi визначення (x <= " + c1 + ")");
    }
  }

  @Override
  public double f(double x){
    return Math.pow(x, 3) * Math.sqrt(c1 - x) + c2;
  }

}
