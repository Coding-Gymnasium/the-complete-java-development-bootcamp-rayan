package section_seven;

public class Main {
  public static void main(String[] args) {

    Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] { "Tires", "Keys" });
    Car nissan2 = new Car(nissan);

    nissan2.setColor("Yellow");
    nissan.drive();
    nissan2.drive();
  }
}
