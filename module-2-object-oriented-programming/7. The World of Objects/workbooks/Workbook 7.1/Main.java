import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    person.setName("Rayan Slim");
    person.setNationality( "Canadian" );
    person.setDateOfBirth( "01/01/1111" );
    person.setName(Arrays.toString(new String[] { person.getName(), person.getNationality(), person.getDateOfBirth() }));
    person.setSeatNumber(  5 );

    System.out.println(person.getName());
    System.out.println(person.getNationality());
    System.out.println(person.getDateOfBirth());
    System.out.println(Arrays.toString(person.getPassport()));
    System.out.println(person.getSeatNumber());

    Person person1 = new Person();
    System.out.println(person1.getName());
    System.out.println(person1.getNationality());
    System.out.println(person1.getDateOfBirth());
    System.out.println(Arrays.toString(person1.getPassport()));
    System.out.println(person1.getSeatNumber());

    Person person2 = new Person("Liz", "USA", "09/04/1975", 1);
    System.out.println(person2.getName());
    System.out.println(person2.getNationality());
    System.out.println(person2.getDateOfBirth());
    System.out.println(Arrays.toString(person2.getPassport()));
    System.out.println(person2.getSeatNumber());
  }
}