public class Person {
  String name = "Nico";
  String nationality = "USA";
  String dateOfBirth = "07/08/1972";
  String[] passport = { name, nationality, dateOfBirth };
  int seatNumber = 10;

  public Person() {
  };

  public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber;
    this.passport = new String[] { this.name, this.nationality, this.dateOfBirth };
  }
}
