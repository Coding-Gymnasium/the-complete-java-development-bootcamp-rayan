public class JoiningStrings {
  public static void main(String[] args) {
    int year = 2010;
    String winner = "Spain";
    // String announcement = "The winner of the " + year + " worldcup was " +
    // winner;
    String announcement = String.format("The winner of the %d worldcup was %s", year, winner);
    System.out.println(announcement);

  }
}
