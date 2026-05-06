package theory.DynamicDispatch;

public class main {
  public static void main(String[] args){

//    Figure FigureObj = new Figure() // цього неможливо зробити
    Figure figure;

    figure = new Rectangle(5, 10);
    System.out.println("Площа прямокутника: " + figure.area());

    figure = new Triangle(8, 11);
    System.out.println("Площа трикутника: " + figure.area());

  }
}

