import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    person.name = "Rayan Slim";
    person.nationality = "Canadian";
    person.dateOfBirth = "01/01/1111";
    person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };
    person.seatNumber = 5;

    System.out.println(person.name);
    System.out.println(person.nationality);
    System.out.println(person.dateOfBirth);
    System.out.println(Arrays.toString(person.passport));
    System.out.println(person.seatNumber);

    Person person1 = new Person();
    System.out.println(person1.name);
    System.out.println(person1.nationality);
    System.out.println(person1.dateOfBirth);
    System.out.println(Arrays.toString(person1.passport));
    System.out.println(person1.seatNumber);

    Person person2 = new Person("Liz", "USA", "09/04/1975", 1);
    System.out.println(person2.name);
    System.out.println(person2.nationality);
    System.out.println(person2.dateOfBirth);
    System.out.println(Arrays.toString(person2.passport));
    System.out.println(person2.seatNumber);
  }
}
