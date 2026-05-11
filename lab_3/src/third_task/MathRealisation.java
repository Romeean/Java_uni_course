package third_task;

import java.math.BigInteger;
;

public class MathRealisation {
  private static final double pi = Math.PI;


  static public double getPi(){
    return pi;
  }


  static public double exp(double x){

    double exp = 1;
    for(int i = 1; i < 10; i++){
      exp += (MathRealisation.power(x, i) / MathRealisation.factorial(i));
    }
    return exp;
  }

  static public double factorial(int value){
    if(value < 0){
      throw new IllegalArgumentException("Значення для обчислювального факторiaлу повинно буде бiльше за нуль");
    }
    if(value == 1 || value == 0) return 1.0;
    if(value > 170) {
      throw new IllegalArgumentException("Для цього значення факторіал буде набувати Infinity через переповнення типу double");
    }

    double factorial = 1;
    for(int i = 1; i <= value; i++){
      factorial *= i;
    }
    return factorial;

  }

  static public double power(double x, double n){
    if(n == 0) return 1.0;
    if(n == 1) return x;
    if(n < 0)  return 1.0 / power(x, -n);
    if(n != (int) n) {
      return Math.pow(x, n);
    }


    double power = x;

    for(int i = 1; i < n; i++){
      power *= x;
    }

    return power;
  }

  static public double sin(double x){
    x = x % (2 * Math.PI);
    if(x > Math.PI)  x -= 2 * Math.PI;
    if(x < -Math.PI) x += 2 * Math.PI;

    double result = x;
    int sign = 1;
    for(int i = 3; i < 11; i+=2){
      if(sign == 1){
        result -= MathRealisation.power(x, i) / MathRealisation.factorial(i);
        sign--;
      } else {
        result += MathRealisation.power(x, i) / MathRealisation.factorial(i);
        sign++;
      }
    }

    return result;
  }

  static public double cos(double x){
    x = x % (2 * Math.PI);
    if(x > Math.PI)  x -= 2 * Math.PI;
    if(x < -Math.PI) x += 2 * Math.PI;

    double result = x;
    int sign = 1;
    for(int i = 2; i < 11; i+=2){
      if(sign == 1){
        result -= MathRealisation.power(x, i) / MathRealisation.factorial(i);
        sign--;
      } else {
        result += MathRealisation.power(x, i) / MathRealisation.factorial(i);
        sign++;
      }
    }
    return result;
  }

  static public double besselJ(double x, int n){
    double term = MathRealisation.power(x / 2.0, n);
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

  static double FourSin(double x, double[] coefficients, double L) {
    if(coefficients == null || coefficients.length == 0){
      throw new IllegalArgumentException("Масив коефіцієнтів не може бути порожнім або null");
    }
    if(L == 0){
      throw new IllegalArgumentException("L не може бути рівним нулю (ділення на нуль)");
    }
    double sum = 0;

    for (int i = 0; i < coefficients.length; i++) {
      int harmonic = i + 1;
      sum += coefficients[i] * Math.sin(Math.PI * x * harmonic / L);
    }
    return sum;
  }

  static double FourCos(double x, double[] coefficients, double L) {
    if(coefficients == null || coefficients.length == 0){
      throw new IllegalArgumentException("Масив коефіцієнтів не може бути порожнім або null");
    }
    if(L == 0){
      throw new IllegalArgumentException("L не може бути рівним нулю (ділення на нуль)");
    }
    double sum = 0;

    for (int i = 0; i < coefficients.length; i++) {
      sum += coefficients[i] * Math.cos(Math.PI * x * i / L);
    }

    return sum;
  }
}