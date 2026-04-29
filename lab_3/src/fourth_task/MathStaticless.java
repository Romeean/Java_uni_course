package fourth_task;


public class MathStaticless {
  private final double pi = Math.PI;


    public double getPi(){
    return pi;
  }


    public double exp(int x){

    double exp = 1;
    for(int i = 1; i < 10; i++){
      exp += (this.power(x, i) / this.factorial(i));
    }
    return exp;
  }

    public double factorial(int value){
    if(value < 0){
      throw new Error("Значення для обчислювального факторiaлу повинно буде бiльше за нуль");
    }
    if(value == 1 || value == 0) return 1.0;
    if(value > 170) {
      throw new Error("Для цього значення факторіал буде набувати Infinity через переповнення типу double");
    }

    double factorial = 1;
    for(int i = 1; i <= value; i++){
      factorial *= i;
    }
    return factorial;

  }

    public double power(double x, double n){
    if(n == 1) return x;


    double power = x;

    for(int i = 1; i < n; i++){
      power *= x;
    }

    return power;
  }

    public double sin(double x){
    double result = x;
    int sign = 1;
    for(int i = 3; i < 11; i+=2){
      if(sign == 1){
        result -= this.power(x, i) / this.factorial(i);
        sign--;
      } else {
        result += this.power(x, i) / this.factorial(i);
        sign++;
      }
    }

    return result;
  }

    public double cos(double x){
    double result = 1;
    int sign = 1;
    for(int i = 2; i < 11; i+=2){
      if(sign == 1){
        result -= this.power(x, i) / this.factorial(i);
        sign--;
      } else {
        result += this.power(x, i) / this.factorial(i);
        sign++;
      }
    }
    return result;
  }

    public double besellJ(double x, int n){
    double term = this.power(x / 2.0, n);
    for (int i = 1; i <= n; i++) {
      term /= i;
    }
    double sum = term;

    for (int m = 1; m < 100; m++) {
      term *= -1.0 * (x / 2.0) * (x / 2.0) / (m * (m + n));
      sum += term;

      if (Math.abs(term) < 1e-10) break;
    }

    return sum;

  }

    double FourSin(double x, double[] coefficients, double L) {
    double sum = 0;

    for (int i = 0; i < coefficients.length; i++) {
      int harmonic = i + 1;
      sum += coefficients[i] * Math.sin(Math.PI * x * harmonic / L);
    }

    return sum;
  }

    double FourCos(double x, double[] coefficients, double L) {
    double sum = 0;

    for (int i = 0; i < coefficients.length; i++) {
      sum += coefficients[i] * Math.cos(Math.PI * x * i / L);
    }

    return sum;
  }



}