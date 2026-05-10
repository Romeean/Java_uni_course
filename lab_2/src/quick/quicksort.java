package quick;

public class quicksort {
  public static void quick_sort(double[] arr, int left, int right){

    if(left >= right) return;
    int pivot = partition(arr, left, right);

    quick_sort(arr, left, pivot - 1);
    quick_sort(arr, pivot + 1, right);

  }
  public static int partition(double[] arr, int left, int right){
    double pivot = arr[right];
    int i = left - 1;
    for(int j = left; j < right; j++){
      if(arr[j] < pivot){
        i++;
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

      }
    }
    i++;
    double temp = arr[i];
    arr[i] = arr[right];
    arr[right] = temp;


    return i;
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
    quick_sort(arr, 0, arr.length - 1);
    long time2 = System.currentTimeMillis();
    System.out.println("Time = " + (double)(time2 - time1)/1000 + "s");


  }
}
