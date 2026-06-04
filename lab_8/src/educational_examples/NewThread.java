package educational_examples;

public class NewThread extends Thread {

  public short start = 0;
  private final short end = 10;

  public NewThread(String title){
    super(title);
  }

  public void run(){
    while(start < end){
      System.out.println("Виконується потiк: " + Thread.currentThread().toString());

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
    NewThread thread = new NewThread("MyLovelyThread");
    System.out.println(thread.getName());
    thread.run();
  }

}
