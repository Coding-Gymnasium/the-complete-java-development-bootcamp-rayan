public class DocDocuments {
  public static void main(String[] args) {

  }

  /**
   * Function name: greet
   * 
   * Inside the function:
   * 1. Prints 'hi'
   */

  public static void greet() {
    System.out.println("Hi");
  }

  /**
   * Function name: printText
   * 
   * @param name (String)
   * @param age  (String)
   * 
   * 
   *             Inside the function:
   *             1. prints the name and age as part of a text.
   * 
   */

  public static void printText(String name, String age) {
    System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
  }

  /**
   * Function name: calculateArea
   * 
   * @param length (double)
   * @param width  (double)
   * @return (double)
   * 
   *         Inside the function:
   *         1. multiplies length and width to obtain area
   *         2. returns area.
   */

  public static double calculateArea(double length, double width) {
    double area = length * width;
    return area;
  }
}
