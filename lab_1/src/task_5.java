public class task_5 {
  static double fact(int point){
    if(point > 0){

      double sum = point;

      for(int i = point - 1; i > 0; i--){
        sum *= i;
      }
      return sum;
    }
    return Double.MAX_VALUE;
  }

  public void main(String[] args){
    for(int i = 1; true; i++){
      double result = fact(i);
      if(result == Double.POSITIVE_INFINITY){
        System.out.println("Max value: " + Double.MAX_VALUE);
        return;
      }
      System.out.println("Факторiал для числа: " + i + " = " + fact(i));
    }
  }
}
// Числа якi ми отримуємо при значеннi факторiала бiльше нiж за 170, не влазять в 64 бiтний тип double
// На це вказує експонента, експонента бiльше нiж 308 не може бути виведена.