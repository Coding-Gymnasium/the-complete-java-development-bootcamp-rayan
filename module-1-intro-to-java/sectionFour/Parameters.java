import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parameters {
  public static void main(String[] args) {
    BigDecimal area1 = calculateArea(2.3, 3.5);
    BigDecimal area2 = calculateArea(1.6, 2.4);
    System.out.println(area1);
    System.out.println(area2);
  }

  public static BigDecimal calculateArea(double length, double width) {
    BigDecimal area;
    area = new BigDecimal(length * width).setScale(2, RoundingMode.HALF_EVEN);
    return area;
  }
}
