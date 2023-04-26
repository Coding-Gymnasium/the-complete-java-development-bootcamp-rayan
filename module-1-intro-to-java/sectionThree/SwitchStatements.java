public class SwitchStatements {
  public static void main(String[] args) {

    // Section 1: Weather conditions
    String weather = "sunny";
    // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy,
    // snowy)
    // Decide whether to use if-else or switch
    switch (weather) {
      case "sunny":
        System.out.println("wear shorts");
        break;
      case "cloudy":
        System.out.println("wear long sleeves");
        break;
      case "rainy":
        System.out.println("bring an umbrella");
        break;
      default:
        System.out.println("It's snowing. Bring boots");
        break;
    }

    // Section 2: User role
    int role = 2;
    // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3:
    // user)
    // Decide whether to use if-else or switch
    switch (role) {
      case 1:
        System.out.println("Admin");
        break;
      case 2:
        System.out.println("Editor");
        break;
      default:
        System.out.println("User");
        break;
    }

    // Section 3: Temperature and humidity
    int temperature = 75;
    int humidity = 65;
    // Determine the comfort level based on both temperature and humidity (e.g., too
    // hot, too cold, comfortable)
    // Decide whether to use if-else or switch
    if (temperature >= 80 && humidity >= 60) {
      System.out.println("It's too hot and humid");
    } else {
      System.out.println("Must be nice out");
    }

    // Section 5: Age and income
    int age = 25;
    int income = 50000;
    // Determine eligibility for a specific credit card based on age and income
    // Decide whether to use if-else or switch
    if (age > 18 && income > 40000) {
      System.out.println("You are eligible");
    } else {
      System.out.println("You are not eligible");
    }

    // Section 1: Traffic light colors
    String lightColor = "green";
    // Determine what action to take based on the traffic light color (e.g., green,
    // yellow, red)
    // Decide whether to use if-else or switch
    switch (lightColor) {
      case "green":
        System.out.println("Green");
        break;
      case "yellow":
        System.out.println("Yellow");
        break;
      case "red":
        System.out.println("Red");
        break;
      default:
        System.out.println("Not a light color");
        break;
    }

    // Section 2: Exam grade
    int grade = 85;
    // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
    // Decide whether to use if-else or switch
    if (grade == 100) {
      System.out.println("A");
    } else if (grade < 100 && grade >= 90) {
      System.out.println("B");
    } else if (grade < 90 && grade >= 80) {
      System.out.println("C");
    } else if (grade < 80 && grade >= 70) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    // Section 3: Browser type
    String browser = "Chrome";
    // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge,
    // or Opera
    // Decide whether to use if-else or switch
    switch (browser) {
      case "Chrome":
        System.out.println("Chrome");
        break;
      case "Firefox":
        System.out.println("Firefox");
        break;
      case "Edge":
        System.out.println("Edge");
        break;
      case "Safari":
        System.out.println("Safari");
        break;
      default:
        System.out.println("Opera");
        break;
    }

  }
}
