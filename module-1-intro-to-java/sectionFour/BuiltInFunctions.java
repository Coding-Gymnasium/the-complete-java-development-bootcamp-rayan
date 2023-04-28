public class BuiltInFunctions {

  public static void main(String[] args) {

    /**
     * Scenario 1
     * 
     * Find a built-in function that prints the message on the console.
     * 
     * @param message (String)
     */
    String message = "Hello, World!";
    // Write your code here
    System.out.println(message);

    /**
     * Scenario 2
     * 
     * Find a built-in function that returns the length of a string.
     * 
     * @return length (int)
     */
    String example = "Java";
    // Write your code here
    System.out.println(example.length());

    /**
     * Scenario 3
     * 
     * Find a built-in function that converts a string to lowercase.
     * 
     * @return lowerCase (String)
     */
    String upperCase = "JAVA";
    // Write your code here
    String x = upperCase.toLowerCase();
    System.out.println(x);

    /**
     * Scenario 4
     * 
     * Find a built-in function that checks if a string starts with a specified
     * prefix.
     * 
     * @param prefix (String)
     * @return startsWithPrefix (boolean)
     */
    String programming = "Java programming";
    // Write your code here
    boolean startsWithJava = programming.startsWith("Java", 0);
    boolean secondWordStartsWithPro = programming.startsWith("pro", 5);
    System.out.println("Does it start with Java?: " + startsWithJava);
    System.out.println("Does the second word start with pro?: " + secondWordStartsWithPro);

    /**
     * Scenario 5
     * 
     * Find a built-in function that replaces all occurrences of a specified
     * character in a string with another character.
     * 
     * @param oldChar (char)
     * @param newChar (char)
     * @return replacedString (String)
     */
    String original = "Java is fun!";
    // Write your code here
    String updated = original.replace("a", "i");
    System.out.println(updated);

    /**
     * Scenario 6
     * 
     * Find a built-in function that calculates the square root of a number.
     * 
     * @param number (double)
     * @return squareRoot (double)
     */

    double number = 9;
    // Write your code here
    double squareRoot = Math.sqrt(number);
    System.out.println(squareRoot);

    /**
     * Scenario 7
     * 
     * Find a built-in function that calculates the power of a number.
     * 
     * @param base     (double)
     * @param exponent (double)
     * @return power (double)
     */
    double base = 2;
    double exponent = 3;
    // Write your code here
    double result = Math.pow(base, exponent);
    System.out.println(result);

    /**
     * Scenario 8
     * 
     * Find a built-in function that generates a random number between 0.0
     * (inclusive) and 1.0 (exclusive).
     * 
     * @return randomNumber (double)
     */
    // Write your code here
    double randomNumber = Math.random();
    System.out.println(randomNumber);

    /**
     * Scenario 9
     * 
     * Find a built-in function that returns the larger of two numbers.
     * 
     * @param number1 (int)
     * @param number2 (int)
     * @return maxNumber (int)
     */
    int number1 = 5;
    int number2 = 10;
    // Write your code here
    int maxNumber = Math.max(number1, number2);
    System.out.println(maxNumber);

  }
}
