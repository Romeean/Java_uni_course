public class Polynom {
  static class Polynome {
    private int n;        // количество коэффициентов, или же длинна полинома.
    private double[] arr; // массив коэффициентов, где значение - число, индекс - степень.

    Polynome(double[] arr){
      set(arr);
    }

    Polynome(int n){
      set(n, 0);
    }

    public int getLength(){
      return this.n;
    }
    public double[] getArr(){
      return this.arr;
    }

    public void set(double[] arr){
      this.n = arr.length;
      this.arr = arr.clone();

    }

    public void set(int n, double k){
      this.n = n;
      this.arr = new double[n];

      for(int i = 0; i < n; i++) {
        this.arr[i] = k;
      }
    }
    public void set(int n) {
      set(n, 0);
    }

    // найти значение полинома при x = n;
    public double value(double value){
      double sum = 0;
      for(int i = 0; i < this.arr.length; i++){
        sum += this.arr[i] * Math.pow(value, i);

      }
      return sum;
    }
    // красивый вывод полинома
    public void print(){
      System.out.print(arr[0]);
      for(int i = 1; i < n; i++){
        System.out.print(" + " + arr[i] + "x^" + i );
      }
    }

    // сложение полиномов;
    public Polynome plus(Polynome p1) {
      Polynome p2;
      if (this.n >= p1.n) {

        p2 = new Polynome(this.arr);
        for (int i = 0; i < p1.n; i++){
          p2.arr[i] += p1.arr[i];
        }

      } else {

        p2 = new Polynome(p1.arr);
        for (int i = 0; i < this.n; i++){
          p2.arr[i] += this.arr[i];
        }

      }
      return p2;
    }
    // скалярное умножение
    public Polynome prod(double coefficient){
      Polynome copy = new Polynome(this.arr);

      for(int i = 0; i < copy.n; i++){
        copy.arr[i] *= coefficient;
      }

      return copy;
    }

    // деление на число
    public Polynome div(double z){
      if(z == 0) {
        throw new ArithmeticException("You can't use 0 in divide operation. ");
      }
      return prod(1 / z);
    }

    // производная первого типа
    public Polynome diff(){
      if(this.n == 1) return new Polynome(1);

      int diffedDegree = this.n - 1;

      Polynome diffedPolynom = new Polynome(diffedDegree);


      for(int i = 0; i < diffedDegree; i++){
        diffedPolynom.arr[i] = (i + 1) * this.arr[i + 1];
      }

      return diffedPolynom;
    }
    public Polynome diff(int j){
      if(j >= this.arr.length) return new Polynome(1);

      if(j > 0){
        return diff().diff(j - 1);
      }

      // j = 0, производная нуля, это и есть сам полином.
      return new Polynome(this.arr);
    }
  }

  public static void main(String[] args){
    Polynome polynome1 = new Polynome(new double[]{1.0, 2.0, 3.0, 4.0});
    Polynome polynome2 = new Polynome(new double[]{10.0, 20.0, 30.0, 40.0});

    Polynome p = polynome1.diff(4);
    p.print();


  }
}
