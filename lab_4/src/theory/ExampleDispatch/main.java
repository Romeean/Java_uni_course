package theory.ExampleDispatch;


public class main {
  public static void main(String[] args){
    A a = new A(); // об’єкт класу A
    B b = new B(); // об’єкт класу B
    C c = new C(); // об’єкт класу C
    A r; // змінна посилання типу A

    r = a; // r посилається на об’єкт класу A
    r.callme(); // викликається метод callme iз класу A

    r = b; // r посилається на об’єкт класу B
    r.callme(); // викликається метод callme iз класу В

    r = c; // r посилається на об’єкт класу C
    r.callme(); // викликається метод callme iз класу С
  }
}
