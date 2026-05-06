package theory.DynamicDispatch;

public class Triangle extends Figure {

  public Triangle(double a, double b){
      super(a, b);
  }

  public double area(){
    return getA() * getB() / 2;
  }
}
