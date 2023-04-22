public class Decimals {
  public static void main(String[] args) {
    double percentage = 73.5;
    System.out.println(percentage + " percent of 100");

    int wallet = 20; // always use doubles for math calculations.
    int people = 3;
    System.out.println(wallet / people); // java int are rounded down.

    // if there is at least one double in the math calculation Java will know to
    // return a double.
    double dividend = 11;
    double divisor = 2;
    System.out.println(dividend / divisor);
  }

}
