package sample.lists.nullelement;

import java.util.ArrayList;
import java.util.List;

public class ListNullElementMain {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(null);
    System.out.printf("l.get(0) = %", l.get(0));
  }
}
