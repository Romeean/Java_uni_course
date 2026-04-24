package second_task;

public class Polynom {
    private int n;        // количество коэффициентов, или же длинна полинома.
    private double[] arr; // массив коэффициентов, где значение - число, индекс - степень.

    Polynom(double[] arr){
      set(arr);
    }

    Polynom(int n){
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
      System.out.println();
      System.out.println();
    }

    // сложение полиномов;
    public Polynom plus(Polynom p1) {
      Polynom p2;
      if (this.n >= p1.n) {

        p2 = new Polynom(this.arr);
        for (int i = 0; i < p1.n; i++){
          p2.arr[i] += p1.arr[i];
        }

      } else {

        p2 = new Polynom(p1.arr);
        for (int i = 0; i < this.n; i++){
          p2.arr[i] += this.arr[i];
        }

      }
      return p2;
    }
    // скалярное умножение
    public Polynom prod(double coefficient){
      Polynom copy = new Polynom(this.arr);

      for(int i = 0; i < copy.n; i++){
        copy.arr[i] *= coefficient;
      }

      return copy;
    }
    public Polynom prod(Polynom p){
      int resultLength = this.arr.length + p.arr.length - 1;
      Polynom result = new Polynom(resultLength);

      for (int i = 0; i < this.arr.length; i++) {
        for (int j = 0; j < p.arr.length; j++) {
          result.arr[i + j] += this.arr[i] * p.arr[j];
        }
      }

      return result;
    }

    // деление на число
    public Polynom div(double z){
      if(z == 0) {
        throw new ArithmeticException("You can't use 0 in divide operation. ");
      }
      return prod(1 / z);
    }

    // производная первого типа
    public Polynom diff(){
      if(this.n == 1) return new Polynom(1);

      int diffedDegree = this.n - 1;

      Polynom diffedPolynom = new Polynom(diffedDegree);


      for(int i = 0; i < diffedDegree; i++){
        diffedPolynom.arr[i] = (i + 1) * this.arr[i + 1];
      }

      return diffedPolynom;
    }

    public Polynom diff(int j){
      if(j >= this.arr.length) return new Polynom(1);

      if(j > 0){
        return diff().diff(j - 1);
      }

      // j = 0, производная нуля, это и есть сам полином.
      return new Polynom(this.arr);
    }

    public Polynom minus(Polynom p){
      return plus(p.prod(-1));
    }

    static boolean equals(Polynom a, Polynom b) {
      if (a.n != b.n) return false;
      for (int i = 0; i < a.n; i++) {
        if (a.arr[i] != b.arr[i]) return false;
      }
      return true;
    }
  }

