package integral;

public class Main {

  static void main(){
    FunctionalIntegral funcInt;

    funcInt = new QuadraticFunction(0, Math.PI, 1, 4);
    System.out.println("КВАДРАТИЧНА ФУНКЦIЯ ");
    System.out.println("Rectangle Method(middle): " + funcInt.rectangle());
    System.out.println("Rectangle Trapezoid: " + funcInt.trapezoid());
    System.out.println("Rectangle Simpson: " + funcInt.simpson());
    System.out.println();


    funcInt = new CombinedAlgebraicFunction(0, Math.PI, 4, 5);
    System.out.println("КОМБІНОВАНА АЛГ. ФУНКЦIЯ ");
    System.out.println("Rectangle Method(middle): " + funcInt.rectangle());
    System.out.println("Rectangle Trapezoid: " + funcInt.trapezoid());
    System.out.println("Rectangle Simpson: " + funcInt.simpson());
    System.out.println();


    funcInt = new ExponentialFunction(0, Math.PI,  4);
    System.out.println("ЕКСПОНEНЦIАЛЬНА ФУНКЦIЯ ");
    System.out.println("Rectangle Method(middle): " + funcInt.rectangle());
    System.out.println("Rectangle Trapezoid: " + funcInt.trapezoid());
    System.out.println("Rectangle Simpson: " + funcInt.simpson());
    System.out.println();


  }
}
