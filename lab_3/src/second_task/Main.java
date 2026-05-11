package second_task;


public class Main {
  public static void main(){

    Polynom Polynom1 = new Polynom(new double[]{1.0, 2.0, 3.0, 4.0});
    Polynom Polynom2 = new Polynom(new double[]{10.0, 20.0, 30.0, 40.0});

    System.out.print("Операцiя додавання: ");
    Polynom1.plus(Polynom2).print();
    System.out.print("Операцiя вiднiмання: ");
    Polynom2.minus(Polynom1).print();
    System.out.print("Операцiя множення (на число): ");
    Polynom1.prod(2.0).print();
    System.out.print("Операцiя множення (на полiном): ");
    Polynom1.prod(Polynom2).print();
    System.out.print("Операцiя дiлення: ");
    Polynom2.div(2.0).print();
    System.out.print("Похiдна першого порядку: ");
    Polynom1.diff().print();
    System.out.print("Похiдна n-го порядку: ");
    Polynom1.diff(2).print();
    System.out.print("Чи рiвнi два полiноми мiж собою: ");

    boolean isEqual = Polynom.equals(Polynom1, Polynom2);
    if(isEqual){
      System.out.print("Так");
    } else {
      System.out.print("Нi");
    }
  }
}
