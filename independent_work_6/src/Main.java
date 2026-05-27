import java.util.ArrayList;

class Main {
  static int[] lengths = { 10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000 };

  static ArrayList<Double> measureString() {
    ArrayList<Double> result = new ArrayList<>();

    for (int length : lengths) {
      double total = 0;

      for (int j = 0; j < 10; j++) {
        String a = "";
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
          a += "a";
        }
        total += System.currentTimeMillis() - startTime;
      }
      result.add(total / 10);

    }
    return result;
  }

  static ArrayList<Double> measureBuffer() {
    ArrayList<Double> result = new ArrayList<>();

    for (int length : lengths) {
      double total = 0;

      for (int j = 0; j < 10; j++) {
        StringBuffer a = new StringBuffer();
        double startTime = System.currentTimeMillis();

        for (int i = 0; i < length; i++) {
          a.append("a");
        }

        total += System.currentTimeMillis() - startTime;
      }
      result.add(total / 10);

    }
    return result;
  }

  static ArrayList<Double> measureBuilder() {
    ArrayList<Double> result = new ArrayList<>();

    for (int length : lengths) {
      double total = 0;

      for (int j = 0; j < 10; j++) {
        StringBuilder a = new StringBuilder();
        double startTime = System.currentTimeMillis();

        for (int i = 0; i < length; i++) {
          a.append("a");
        }

        total += System.currentTimeMillis() - startTime;
      }
      result.add(total / 10);

    }
    return result;
  }

  static void print(ArrayList<Double> result){
    int i = 1;
    for(double record : result){
      System.out.println(i + ": " + record);
      i++;
    }
    System.out.println();
  }

  public static void main(String[] args){

    ArrayList<Double> resultString = measureString();
    ArrayList<Double> resultBuffer = measureBuffer();
    ArrayList<Double> resultBuilder = measureBuilder();


    System.out.println("StringBuilder: ");
    print(resultBuilder);

  }
}