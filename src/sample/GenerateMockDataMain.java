package sample;

public class GenerateMockDataMain {

  private static final int LENGTH = 2000;

  public static void main(String[] args) {
    System.out.println("Generate mock string of length " + LENGTH);
    for (int i = 0; i < LENGTH; i++) {
      System.out.print(i%10);
    }
  }
}
