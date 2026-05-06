package theory.DynamicDispatch;

public class Rectangle extends Figure {

  public Rectangle(double a, double b){
    super(a, b);
  }

  public double area(){
    return getA() * getB();
  }


}
