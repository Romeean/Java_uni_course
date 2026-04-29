package fourth_task;

public class MainMath {
  public static void main(String[] args){
    MathStaticless math = new MathStaticless();

    // Pi
    System.out.println("Число pi: " + math.getPi());

    // Factorial
    System.out.println("Факторiал 5!: " + math.factorial(5));

    // Exponent
    System.out.println("Експонента e^2: " + math.exp(2));

    // Power
    System.out.println("Степiнь 2^10: " + math.power(2, 10));

    // Sin
    System.out.println("Sin(1): " + math.sin(1));

    // Cos
    System.out.println("Cos(1): " + math.cos(1));

    // Bessel (J₀(2.404825558) ≈ 0)
    System.out.println("Функцiя Бесселя J при (2.404825558): " + math.besellJ(2.404825558, 0));

    // FourSin
    double[] coefficients = {1.0, 0.5, 0.25};
    System.out.println("Ряд Фур'є sin при x=1: " + math.FourSin(1.0, coefficients, Math.PI));

    // FourCos
    System.out.println("Ряд Фур'є cos при x=1: " + math.FourCos(1.0, coefficients, Math.PI));
  }
}