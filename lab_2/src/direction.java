public class direction {
  public static void direction_sort(double[] arr){
    double temp;

    for(int i = 0; i < arr.length - 1; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] > arr[j]){
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
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
    direction_sort(arr);
    long time2 = System.currentTimeMillis();
    System.out.println("Time = " + (double)(time2 - time1)/1000 + "s");


  }
}
