
public class task_4 {
  public static double increaseDegree(int degree){
      return Math.pow(2, degree);
  }

  public static void main(String[] args) {
    for(int i = 0; true; i++){
      double result = increaseDegree(i);
      if(result == Double.POSITIVE_INFINITY){
        return;
      } else {
        System.out.println(result + " dergee: " + i);
      }
    }
  }
}
// Найбiльша ступiнь в яку можливо пiднести 2-ку це число 1023
// Це пов'язано з тим що для числа double видiленно 64 бiти
//                              52 мантiса || 11 експонента | 1 для знаку
//                                                |
//                                        2 значення зарезервованнi (Infinity, NaN)
//                                        це дозволяє помiстити дiапазон вiд
//                                        -1022 до 1023.
