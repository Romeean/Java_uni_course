package insertion;

public class insertionsort {
  public static void insertion_sort(double[] arr){
    for(int i = 1; i < arr.length; i++){
      double key = arr[i];
      int j = i - 1;

      while(j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;

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
    insertion_sort(arr);
    long time2 = System.currentTimeMillis();
    System.out.println("Time = " + (double)(time2 - time1)/1000 + "s");


  }
}