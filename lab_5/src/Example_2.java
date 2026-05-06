public class Example_2 {
  public static void main(String[] args){
    try {
      int number_1 = 0;
      int number_2 = 10;
      try {
        if(args.length == 1) {
          int number_3 = number_2 / number_1;
        }
        if(args.length == 2){
          int[] arr = {1, 2};
          arr[100] = 10;
        }
      } catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Exception: " + e.getMessage());
      }
    } catch(ArithmeticException e){
        System.out.println("Exception: " + e.getMessage());
    }
  }

}
