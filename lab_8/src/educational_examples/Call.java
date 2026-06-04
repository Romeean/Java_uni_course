package educational_examples;

public class Call {

  synchronized static void call(String msg) {
    System.out.print("[" + msg);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
    System.out.println("]");
  }

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> call("Hello"));
    Thread t2 = new Thread(() -> call("Synchronized"));
    Thread t3 = new Thread(() -> call("World"));

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
    } catch (InterruptedException e) {
      System.out.println("Перервано");
    }
  }
}


