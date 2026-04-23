public class task_6 {


  public static void main(String[] args){
    int count = 0;

    for(int n = 2; n < 10; n++){
      for(int i = 1; i < 100; i++){
        for(int j = 1; j < 100; j++){
          for(int k = 1; k < 100; k++){
            long a = (long) Math.pow(i, n);
            long b = (long) Math.pow(j, n);
            long c = (long) Math.pow(k, n);

            long firstTake =  a + b;
            long secondTake = c;

            if(firstTake == secondTake){
              System.out.println("Сумма a^2 + b^2 = c^2 вiрно для таких значень: ");
              System.out.println("a: " + i + " b: " + j + " c: " + k  + '\n');
              count++;
            }
          }
        }
      }
    }

    System.out.println("Знайдено рiшень: " + count);

  }

}