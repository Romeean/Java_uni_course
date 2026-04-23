import java.util.Arrays;

public class task_7 {

  public static int getMinIndex(int[] array){

    int minIndex = 0;
    for(int i = 0; i < array.length; i++){
      if(array[minIndex] > array[i]){
        minIndex = i;
      }
    }

    return minIndex;
  }
  public static int getMaxIndex(int[] array){
    int maxIndex = 0;
    for(int i = 0; i < array.length; i++){
      if(array[maxIndex] < array[i]){
        maxIndex = i;
      }
    }

    return maxIndex;
  }

  public static void main( String[] args ){
    if(args.length == 0) return;


    if(args.length >= 2){

     int[] array = new int[args.length];

     for(int i = 0; i < array.length; i++){
       array[i] = Integer.parseInt(args[i]);
     }


     System.out.println("Незмiненний масив: " + Arrays.toString(array));

     int minIndex = getMinIndex(array);
     int maxIndex = getMaxIndex(array);

     int maxValue = array[maxIndex];
     int minValue = array[minIndex];

      array[minIndex] = maxValue;
      array[maxIndex] = minValue;

      System.out.println("Змiненний масив: " + Arrays.toString(array));

      return;
    }
  }
}