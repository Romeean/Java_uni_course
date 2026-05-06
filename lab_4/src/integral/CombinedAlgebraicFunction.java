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

  @Override
  public double rectangle(){
    int numRectangles = 1000;
    double width = (getB() - getA()) / numRectangles;

    double start = getA();
    double sum = 0.0; // сума вершин всіх прямокутників

    for(int i = 0; i < numRectangles; i++){
      double mid = start + i * width + width / 2;

      sum += f(mid);
    }

    return width * sum;
  }

  @Override
  public double trapezoid(){
    int numTrapezoid = 1000;
    double width = (getB() - getA()) / numTrapezoid;
    double start = getA();
    double end = getB();
    double sum;

    // эти точки считаются дважды, если не делить => неправильный результат
    sum = (f(start) + f(end)) / 2;


    for(int i = 1; i < numTrapezoid; i++){
      double x = start + i * width;
      sum += f(x);
    }
    return width * sum;
  }

  @Override
  public double simpson(){
    double num = 1000; // обов'язково парне число
    double width = (getB() - getA()) / num;
    double start = getA();
    double end = getB();

    double sum = f(start) + f(end);

    for(int i = 1; i < num; i++){
      double x = start + i * width;

      if(i % 2 == 0){
        sum += f(x) * 2;
      }

      if(i % 2 == 1){
        sum += f(x) * 4;
      }
    }

    return (width / 3) * sum;
  }
}
