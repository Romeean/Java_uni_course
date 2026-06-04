package main_task;

public class Matrix {
  static double[][] matrice1 = new double[1000][1000];
  static double[][] matrice2 = new double[1000][1000];

  static public void MatrixManipulation(double[][] newMatrice, int left, int right, Operations operations){
    switch(operations){
      case PLUS: {
        for(int i = left; i < right; i++){
          for(int j = 0; j < 1000; j++){
            double sum = matrice1[i][j] + matrice2[i][j];
            newMatrice[i][j] = sum;
          }
        }
        break;
      }

      case MULTIPLICATION: {
        for(int i = left; i < right; i++){
          for(int j = 0; j < 1000; j++){
            double res = matrice1[i][j] * matrice2[i][j];
            newMatrice[i][j] = res;
          }
        }
        break;
      }

      default: {
        System.out.println("Не правильний вибiр, братанчику =)");
      }
    }
  }

  public static void main(String[] args){
    int choice = Integer.parseInt(args[0]);

    // наповнення першої матриці випадковими числами.
    for(int i = 0; i < 1000; i++){
      for(int j = 0; j < 1000; j++){
        double randomNumber = Math.random() * 100;
        matrice1[i][j] = randomNumber;
      }
    }

    // наповнення другої матриці випадковими числами.
    for(int i = 0; i < 1000; i++){
      for(int j = 0; j < 1000; j++){
        double randomNumber = Math.random() * 100;
        matrice2[i][j] = randomNumber;
      }
    }


    switch(choice){
      case 0: {
        double[][] newMatrice = new double[1000][1000];

        // перший потік опрацьовує діапазон з 0-499(включно)
        Thread worker1 = new Thread(() -> {
          MatrixManipulation(newMatrice, 0, 500, Operations.PLUS);
        });

        // другий потік опрацьовує діапазон з 500-1000
        Thread worker2 = new Thread(() -> {
          MatrixManipulation(newMatrice, 500, 1000, Operations.PLUS);
        });

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

        // однопотокове додавання двох матриць
        double[][] matriceSingleThread = new double[1000][1000];
        long start_2 = System.currentTimeMillis();
        MatrixManipulation(matriceSingleThread, 0, 1000, Operations.PLUS);
        long takes_2 = System.currentTimeMillis() - start_2;


        System.out.println("Multithread adding: "  + takes_1 + "ms");
        System.out.println("Singlethread adding: " + takes_2 + "ms");
        break;
      }

      case 1: {
        double[][] newMatrice = new double[1000][1000];

        // перший потік опрацьовує діапазон з 0-499(включно)
        Thread worker1 = new Thread(() -> {
          MatrixManipulation(newMatrice, 0, 500, Operations.MULTIPLICATION);
        });

        // другий потік опрацьовує діапазон з 50000-1000
        Thread worker2 = new Thread(() -> {
          MatrixManipulation(newMatrice, 500, 1000, Operations.MULTIPLICATION);
        });

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

        // однопотокове додавання двох матриць
        double[][] matriceSingleThread = new double[1000][1000];
        long start_2 = System.currentTimeMillis();
        MatrixManipulation(matriceSingleThread, 0, 1000, Operations.MULTIPLICATION);
        long takes_2 = System.currentTimeMillis() - start_2;


        System.out.println("Multithread multiplication: "  + takes_1 + "ms");
        System.out.println("Singlethread multiplication: " + takes_2 + "ms");
        break;
      }

      default : {
        System.out.println("Такого вибору не iснує, давай заново обирай =)");
        break;
      }

    }
  }
}

