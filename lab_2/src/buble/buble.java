package buble;

public class buble {
  public static void buble_sort(double[] arr){
    double temp;
    boolean flag = true;
    while(flag){
    flag = false;

      for(int i = 0; i < arr.length - 1; i++){
        if(arr[i] > arr[i + 1]){

          temp = arr[i] ;
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
    }
  }
  public static void main(String[] args){
    if(args.length != 1){
      System.out.println("На вхiд приймається лише 1 аргумент - розмiр масиву.");
      return;
    }

    int length = Integer.parseInt(args[0], 10);

    if(length < 0 ) {
      System.out.println("Розмiр масиву не може бути вiд'ємним.");
      return;
    }


    double[] arr = new double[length];
    for(int i = 0; i < length; i++){
      double number = ((1000.0 * Math.random()) - (Math.random() / Math.random()));
      arr[i] = number;
    }

    long time1 = System.currentTimeMillis();
    buble_sort(arr);
    long time2 = System.currentTimeMillis();
    System.out.println("Time = " + (double)(time2 - time1)/1000 + "s");
  }
}
