
public class task_2 {
  public static void main(String[] args){
    if(args.length == 2){
      double side1 = Double.parseDouble(args[0]);
      double side2 = Double.parseDouble(args[1]);

      if(side1 < 0 || side2 < 0){
        System.out.println("Ви повиннi ввести 2 позитивних значення катетiв");
        return;
      }
      double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
      System.out.println("Гiпотенуза: " + hypotenuse);
    } else {
      System.out.println("Введiть 2 катети, за якими буде порахована гiпотенуза. ");
    }
  }
}

