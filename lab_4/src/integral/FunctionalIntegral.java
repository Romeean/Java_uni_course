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


  abstract double f(double x);
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
  };
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
  };
  public double simpson(){
    double num = 1000; // обов'язково ціле число
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
  };

}
