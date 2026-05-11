package third_task;

public class Main {
  public static void main(String[] args){

    // Pi
    double pi = MathRealisation.getPi();
    System.out.println("Число pi: " + pi);

    // Factorial
    double factorial = MathRealisation.factorial(5);
    System.out.println("Факторiал 5!: " + factorial);

    // Exponent
    double exp = MathRealisation.exp(2);
    System.out.println("Експонента e^2: " + exp);

    // Power
    double power = MathRealisation.power(2, 10);
    System.out.println("Степiнь 2^10: " + power);

    // Sin
    double sin = MathRealisation.sin(1);
    System.out.println("Sin(1): " + sin);

    // Cos
    double cos = MathRealisation.cos(1);
    System.out.println("Cos(1): " + cos);

    // Bessel (перевiряємо що J при 2.404825558)
    double bessel = MathRealisation.besselJ(2.404825558, 0);
    System.out.println("Функцiя Бесселя J(2.404825558): " + bessel);

    // FourSin
    double[] sinCoefficients = {1.0, 0.5, 0.25};
    double fourSin = MathRealisation.FourSin(1.0, sinCoefficients, Math.PI);
    System.out.println("Ряд Фур'є (sin) при x=1: " + fourSin);

    // FourCos
    double[] cosCoefficients = {1.0, 0.5, 0.25};
    double fourCos = MathRealisation.FourCos(1.0, cosCoefficients, Math.PI);
    System.out.println("Ряд Фур'є (cos) при x=1: " + fourCos);

  }
}