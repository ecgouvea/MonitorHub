package sample;

public class AutoboxingMain {

  public static void main(String[] args) {
    long time1 = System.currentTimeMillis();
    sum();
    long time2 = System.currentTimeMillis();
    System.out.println(time2 - time1);
  }

  private static long sum() {
    long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++) sum += i;
    return sum;
  }

  // Long = 8573 ms
  // long =  724 ms
}
