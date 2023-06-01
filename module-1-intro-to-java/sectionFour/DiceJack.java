import java.util.Random;
import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // User chooses numbers
    System.out.println("Enter Three numbers from 1 to 6");
    int num1 = scanner.nextInt();
    System.out.println("First Number: " + num1);

    System.out.println("Now the second number, please");
    int num2 = scanner.nextInt();
    System.out.println("Second Number: " + num2);

    System.out.println("Now the third number, please");
    int num3 = scanner.nextInt();
    System.out.println("Third Number: " + num3);

    scanner.close();

    // Roll dice
    long wait = 1000;
    int die1 = 0;
    int die2 = 0;
    int die3 = 0;

    System.out.println("Rolling dice ...");

    try {
      Thread.sleep(wait);
      die1 = rollDice();
      System.out.println(die1);

      Thread.sleep(wait);
      die2 = rollDice();
      System.out.println(die2);

      Thread.sleep(wait);
      die3 = rollDice();
      System.out.println(die3);
    } catch (Exception e) {
      System.err.println("Something went wrong when rolling the dice");
    }

    // Sum up numbers
    int chosenNums = sumUpNums(num1, num2, num3);
    int diceNums = sumUpNums(die1, die2, die3);
    System.out.println("Numbers: " + chosenNums);
    System.out.println("Dice: " + diceNums);

    String result = checkResults(chosenNums, diceNums);
    System.out.println(result);
  }

  public static int sumUpNums(int die1, int die2, int die3) {
    return die1 + die2 + die3;
  }

  public static int rollDice() {
    Random random = new Random();
    int max = 6;
    int min = 1;
    return random.nextInt(max) + min;
  }

  public static String checkResults(int chosenNums, int diceNums) {
    if (chosenNums > diceNums && chosenNums - diceNums <= 3) {
      return "You Won!!!";
    } else {
      return "You Lost";
    }
  }
}
