package educational_examples;

public class NewRunnable implements Runnable {

  static short start = 0;
  static final short end = 10;

  @Override
  public void run(){
    while(start < end){
      System.out.println("Потiк виконується " + Thread.currentThread().toString());

      try {
        Thread.currentThread().sleep(5);
      } catch(InterruptedException e){
        System.err.println(e.toString());
        System.exit(1);
      }
      start++;

    }
  }

  public static void main(String[] args){
    NewRunnable thread = new NewRunnable();
    thread.run();
  }
}

