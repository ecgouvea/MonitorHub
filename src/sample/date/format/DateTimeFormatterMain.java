package sample.date.format;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class DateTimeFormatterMain {

  public static void main(String[] args) {
    DateTimeFormatter dateTimeFormatter =
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withResolverStyle(ResolverStyle.STRICT);
    System.out.println(dateTimeFormatter.parse("2019-07-01 23:59:69"));
  }
}
