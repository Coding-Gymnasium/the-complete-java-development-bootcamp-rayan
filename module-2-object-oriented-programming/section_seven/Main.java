package section_seven;

public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2020, "Green");
    Car nissan2 = new Car(nissan); // this just point to the original object.

    nissan2.setColor("Yellow");

    nissan2.drive();
  }
}
