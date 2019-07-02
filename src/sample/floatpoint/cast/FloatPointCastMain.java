package sample.floatpoint.cast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FloatPointCastMain {

  public static void main(String[] args) throws ParseException {
    System.out.println(Float.valueOf(2047/(float) 1024));
    System.out.println(new Date());

    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //System.out.println(df.parse("Mon Jul 01 20:12:08 UTC 2019"));
    System.out.println(df.parse("0011-01-01 20:12:08"));
  }
}
