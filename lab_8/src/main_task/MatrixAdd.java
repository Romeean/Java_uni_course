package main_task;

public class MatrixAdd {

  static public void addMatrices(double[][] newMatrice, int left, int right){
    for(int i = left; i < right; i++){
      for(int j = 0; j < 1000; j++){
        newMatrice[i][j] = matrice1[i][j] + matrice2[i][j];
      }
    }
  }

  static double[][] matrice1 = new double[1000][1000];
  static double[][] matrice2 = new double[1000][1000];

  public static void main(String[] args){

    for(int i = 0; i < 1000; i++)
      for(int j = 0; j < 1000; j++){
        matrice1[i][j] = Math.random() * 100;
        matrice2[i][j] = Math.random() * 100;
      }

    double[][] newMatrice = new double[1000][1000];
    Thread worker1 = new Thread(() -> addMatrices(newMatrice, 0, 500));
    Thread worker2 = new Thread(() -> addMatrices(newMatrice, 500, 1000));

    long start_1 = System.currentTimeMillis();
    worker1.start();
    worker2.start();
    try {
      worker1.join();
      worker2.join();
    } catch(InterruptedException e) {
      System.err.println(e.getMessage());
      System.exit(1);
    }
    long takes_1 = System.currentTimeMillis() - start_1;

    double[][] matriceSingleThread = new double[1000][1000];
    long start_2 = System.currentTimeMillis();
    addMatrices(matriceSingleThread, 0, 1000);
    long takes_2 = System.currentTimeMillis() - start_2;

    System.out.println("Multithread adding: "  + takes_1 + "ms");
    System.out.println("Singlethread adding: " + takes_2 + "ms");
  }
}