package section_seven;

public class Main {
  public static void main(String[] args) {

    Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] { "Tires", "Keys" });
    nissan.drive();

    Car nissan2 = new Car(nissan);
    String[] carParts = nissan.getParts();
    carParts[0] = "Filter";

    nissan2.setParts(carParts);
    nissan2.setColor("Yellow");
    nissan2.drive();
  }
}
