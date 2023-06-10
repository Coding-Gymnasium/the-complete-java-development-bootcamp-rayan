public class Person {
  private String name = "Nico";
  private String nationality = "USA";
  private String dateOfBirth = "07/08/1972";
  private String[] passport = { name, nationality, dateOfBirth };
  private int seatNumber = 10;

  public Person() {
  };

  public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
    this.seatNumber = seatNumber;
    this.passport = new String[] { this.name, this.nationality, this.dateOfBirth };
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String[] getPassport() {
    return passport;
  }

  public void setPassport(String[] passport) {
    this.passport = passport;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }
}