public class NestedLoops {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println("Outter Loop Run: " + (i + 1));

      for (int j = 0; j < 3; j++) {
        System.out.println("  Inner Loop Run: " + (j + 1));
      }
    }
  }
}
