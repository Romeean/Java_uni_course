public class Example_1 {
  public static void main(String[] args){
    try {
      int number_1 = 0;
      int number_2 = 50;
      int number_3 = number_2 / number_1;
    } catch(ArithmeticException e){
      System.out.println("Function throws exception: " + e.getMessage());
    }
  }
}
