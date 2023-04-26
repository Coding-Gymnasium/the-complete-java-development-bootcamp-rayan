public class IfElse {

  public static void main(String[] args) {

    int chemistryGrade = 95;
    int biologyGrade = 75;
    System.out.println("Me: Hi Java, did I score better in biology?");
    // Add if-else statement here
    if (biologyGrade > chemistryGrade) {
      System.out.println("Yes, it's grater");
    } else {
      System.out.println("No, it was lower");
    }

    double sales = 37.55;
    double costs = 5.55;
    System.out.println("Me: Hi Java, did we make money?");
    // Add if-else statement here
    if (sales > costs) {
      System.out.println("Yes, we did!");
    } else {
      System.out.println("No");
    }

    double temperature = 15.5;
    double targetTemperature = 20.0;
    System.out.println("Me: Hi Java, is the temperature colder than our target?");
    // Add if-else statement here
    if (temperature < targetTemperature) {
      System.out.println("Yes, colder");
    } else {
      System.out.println("No, warmer");
    }

    int currentSpeed = 60;
    int speedLimit = 70;
    System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
    // Add if-else statement here
    if (currentSpeed < speedLimit) {
      System.out.println("Yes, it's lower");
    } else {
      System.out.println("No, it's higher");
    }

    int age = 45;
    int retirementAge = 65;
    System.out.println("Me: Hi Java, am I old enough to retire?");
    // Add if-else statement here
    if (age >= retirementAge) {
      System.out.println("Yes, go retire");
    } else {
      System.out.println("Not yet. You still have to work" + (retirementAge - age) + "years to retire");
    }

    char myGrade = 'A';
    char bestGrade = 'A';
    System.out.println("Me: Hi Java, did I get the best possible grade?");
    // Add if-else statement here
    if (myGrade >= bestGrade) {
      System.out.println("Congrats! you got the best score!");
    } else {
      System.out.println("No, you were short by " + (bestGrade - myGrade) + " points.");

    }

    String word = "hello";
    String secondWord = "hello";
    System.out.println("Me: Are the two words the same?");
    // Add if-else statement here
    if (word.equals(secondWord)) {
      System.out.println("These words are the same");
    } else {
      System.out.println("These words are not the same");
    }

    String thirdWord = "hello";
    String fourthWord = "goodbye";
    System.out.println("Me: Are the two words different");
    // Add if-else statement here
    if (!thirdWord.equals(fourthWord)) {
      System.out.println("These words are not equal");
    } else {
      System.out.println("These words are equal");
    }
  }
}
