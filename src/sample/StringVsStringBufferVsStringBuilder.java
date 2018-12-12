package sample;

public class StringVsStringBufferVsStringBuilder {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    long time1 = System.currentTimeMillis();

    for (int i = 0; i < 100_000; i++) {
      s.append(1);
    }
    long time2 = System.currentTimeMillis();
    System.out.println("s.length(): " + s.length() + " em " + (time2 - time1) + " milissegundos");
  }
  // String         s.length(): 100004 em 6916 milissegundos
  // StringBuffer   s.length(): 100000 em 10 milissegundos
  // StringBuilder  s.length(): 100000 em 10 milissegundos
}
