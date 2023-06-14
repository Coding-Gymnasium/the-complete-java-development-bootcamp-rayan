package section_seven;

public class Main {
  public static void main(String[] args) {
    Car nissan = new Car("Nissan", 10000, 2020, "Green");
    Car nissan2 = new Car(nissan); // this just point to the original object.

    nissan2.setColor("Yellow");
    nissan.setColor("Orange");
    nissan2.setColor("Blue");
    nissan.setColor("Purple");
    nissan2.setColor("Fuchsia");
    nissan.setColor("Beige");

    System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

    System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() +
        ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");
  }
}
