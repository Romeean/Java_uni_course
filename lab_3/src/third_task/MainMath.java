package third_task;
import third_task.MathRealisation;

public class MainMath {
  public static void main(String[] args){

    double sin = MathRealisation.sin(1);
    double cos = MathRealisation.cos(1);
    System.out.println("sin:" + sin);
    System.out.println("cos:" + cos);

    System.out.println(Math.sin(1));
    System.out.println(Math.cos(1));

//    System.out.println("Factorial:" + factorial);
//    System.out.println("Exponent:" + exp);
//    System.out.println("Pi:" + pi);

  }
}
