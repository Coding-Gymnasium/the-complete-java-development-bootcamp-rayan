package section_seven;

public class Main {
  public static void main(String[] args) {
    String[] spareParts = new String[] {"Tires", "Keys"};
    Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
    Car nissan2 = new Car(nissan); // this just point to the original object.
    
    spareParts[0] = "Filter";

    nissan2.setColor("Yellow");

    nissan2.drive();
  }
}
