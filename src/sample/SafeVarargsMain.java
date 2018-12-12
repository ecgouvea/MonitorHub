package sample;

import com.sun.tools.javac.util.List;

import java.util.concurrent.ThreadLocalRandom;

public class SafeVarargsMain {

  public static void main(String[] args) {
    String[] attributes = pickTwo("Good", "Fast", "Cheap");
    dangerous(List.of("Good", "Fast", "Cheap"));
  }

  // Mixing generics and varargs can violate type safety!

//  @SafeVarargs
  static void dangerous(List<String>... stringLists) {

    List<Integer> intList = List.of(42);

    Object[] objects = stringLists;

    objects[0] = intList;             // Heap pollution

    String s = stringLists[0].get(0); // ClassCastException

  }

  // UNSAFE - Exposes a reference to its generic parameter array!

//  @SafeVarargs
  static <T> T[] toArray(T... args) {

    return args;

  }

  static <T> T[] pickTwo(T a, T b, T c) {

    switch(ThreadLocalRandom.current().nextInt(3)) {

      case 0: return toArray(a, b);

      case 1: return toArray(a, c);

      case 2: return toArray(b, c);

    }

    throw new AssertionError(); // Can't get here

  }


}
