package sample.lists.arraylist.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListMain {

  public static final int CAPACITY = 1_000_000_0;

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(CAPACITY);
    List<Integer> l = new LinkedList<Integer>(a);

    long ini = System.currentTimeMillis();
    for (int i = 0; i < CAPACITY; i++) {
      a.add(i);
    }
    long fin = System.currentTimeMillis();
    System.out.println((fin - ini));

    ini = System.currentTimeMillis();
    for (int i = 0; i < CAPACITY; i++) {
      l.add(i);
    }
    fin = System.currentTimeMillis();
    System.out.println((fin - ini));
  }
}
