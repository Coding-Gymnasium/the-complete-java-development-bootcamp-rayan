public class Chorus {
  public static void main(String[] args) {
    // Chorus needs to be sung 5 times
    singChorus();
  }

  public static void singChorus() {
    for (int i = 0; i < 4; i++) {
      System.out.println("Don't blame it on the sunshine");
      System.out.println("Don't blame it on the moonlight");
      System.out.println("Don't blame it on good times");
      System.out.println("Don't blame it on the boogie\n");
    }
  }
}