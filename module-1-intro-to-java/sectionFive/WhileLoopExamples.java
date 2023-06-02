public class WhileLoopExamples {

  public static void main(String[] args) {
    // Example 1: Roll a dice until a 6 is rolled
    // TODO: Write a while loop that simulates rolling a dice until a 6 is rolled
    int dieRoll = 0;
    int rollCount = 0;

    while (dieRoll != 6 && rollCount <= 10) {
      dieRoll = rollDice();
      System.out.println(dieRoll);
      rollCount++;
    }
    // Example 2: Generate random numbers between 1 and 100 until a number greater
    // than 90 is generated
    // TODO: Write a while loop that generates random numbers between 1 and 100
    // until a number greater than 90 is generated
    System.out.println("Random Number between 1 and 100\n");
    int randomNumber = generateRandomNumber();
    int count = 0;

    while (randomNumber <= 100 && count <= 10) {
      System.out.println(randomNumber);
      count++;
    }
    // Example 3: Keep doubling a random number until it's greater than 1000
    // TODO: Write a while loop that keeps doubling the 'number' variable until it's
    // greater than 1000
    System.out.println("Double a random number until it's greater than 1000\n");
    randomNumber = generateRandomNumber();
    System.out.println("Random Number: " + randomNumber);
    int doubleNumber = randomNumber * 2;

    while (doubleNumber <= 1000) {
      doubleNumber *= 2;
      System.out.println(doubleNumber);
    }
  }

  // Function to simulate rolling a dice (returns a random integer between 1 and
  // 6)
  public static int rollDice() {
    return (int) (Math.random() * 6) + 1;
  }

  // Function to generate a random integer between 1 and 100
  public static int generateRandomNumber() {
    return (int) (Math.random() * 100) + 1;
  }
}
