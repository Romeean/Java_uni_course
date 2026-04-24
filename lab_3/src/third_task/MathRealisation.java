package third_task;

import java.math.BigInteger;
;

public class MathRealisation {
  private static final double pi = Math.PI;


  static public double getPi(){
    return pi;
  }


  static public double exp(int x){

    double exp = 1;
    for(int i = 1; i < 10; i++){
      exp += (MathRealisation.power(x, i) / MathRealisation.factorial(i));
    }
    return exp;
  }

  static public double factorial(int value){
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

  static public double power(double x, double n){
    if(n == 1) return x;


    double power = x;

    for(int i = 1; i < n; i++){
      power *= x;
    }

    return power;
  }

  static public double sin(double x){
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
    double result = 1;
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
}