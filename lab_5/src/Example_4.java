public class Example_4 {
  public void demoException() throws ArithmeticException {
    int number_1 = 0;
    int number_2 = 340985;

    int number_3 = number_2 / number_1;
  }

  public void main(String[] args){
    try {
      this.demoException();
    } catch(ArithmeticException e){
        System.out.println("Exception: " + e.getMessage());
    }
  }
}
