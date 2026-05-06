public class Example_3 {
  public void demoException(){
    try{
      int number_1 = 0;
      int number_2 = 123;
      int number_3 = number_2 / number_1;

    } catch(ArithmeticException e){
      System.out.println("Exception called from demoException() method" + e.getMessage());
    }
  }

  public void main(String[] args){
    try {
      this.demoException();
    } catch(ArithmeticException e){
        System.out.println("Exception called from main() method" + e.getMessage());
    }
  }
}