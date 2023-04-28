import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parameters {
  public static void main(String[] args) {
    BigDecimal area1 = calculateArea(2.3, 3.5);
    BigDecimal area2 = calculateArea(1.6, 2.4);
    // BigDecimal area3 = calculateArea(-1.6, 2.4);
    System.out.println(area1);
    System.out.println(area2);

    String explanation1 = explainArea(2.3, 3.5, "Spanish");
    System.out.println(explanation1);

    printArea(2.3, 3.5, area1);
  }

  public static BigDecimal calculateArea(double length, double width) {
    if (length < 0 || width < 0) {
      System.out.println("INVALID DIMENSIONS");
      System.exit(0);
    }

    BigDecimal area;
    area = new BigDecimal(length * width).setScale(2, RoundingMode.HALF_EVEN);
    return area;
  }

  public static String explainArea(double length, double width, String language) {
    BigDecimal area = calculateArea(length, width);

    switch (language) {
      case "English":
        return "Area equals length: " + length + ", * width: " + width + ". Area = " + area;
      case "French":
        return "La surface est egale a la longueur: " + length + ", * la largeur: " + width + ". Surface = "
            + area;
      case "Spanish":
        return "Area es igual a largo: " + length + ", * ancho: " + width + ". Area = " + area;
      default:
        return "Language not available";
    }
  }

  public static void printArea(double length, double width, BigDecimal area) {
    System.out.println(
        "A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area + ".");
  }

}