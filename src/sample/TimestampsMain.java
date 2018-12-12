package sample;

import java.util.Date;

public class TimestampsMain {

  public static void main(String[] args) {
    System.out.println(new Date().getTime()); // Mon Jan 12 10:46:40 BRT 1970
    //    Date date = new Date(1_000_000_000);
    //    System.out.println(date); // Mon Jan 12 10:46:40 BRT 1970
    for (long i = 1_000_000_000L; i < 20_000_000_000L; i+=1_000_000_000L) {
      Date date = new Date(i);
      System.out.printf("%d = %s\n", i, date); // Mon Jan 12 10:46:40 BRT 1970
    }
  }
}
