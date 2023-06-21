package section_seven;

public class Main {
  public static void main(String[] args) {

    Car nissan = new Car("Nissan", 10000, 2020, "Green", new String[] { "Tires", "Keys" });
    String[] carParts = nissan.getParts();
    carParts[0] = "Filter"; // this should have no effect on carParts if we create a copy of the array
                            // this.parts in the class
    nissan.drive();

    Car nissan2 = new Car(nissan);
    nissan2.setColor("Yellow");
    nissan2.drive();
  }
}
