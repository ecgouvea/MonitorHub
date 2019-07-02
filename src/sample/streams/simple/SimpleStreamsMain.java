package sample.streams.simple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SimpleStreamsMain {

  public static void main(String[] args) {
    Consumer<String> c = System.out::println;
    Consumer<String> c1 = System.out::println;
    List l = Arrays.asList("hello");
    l.forEach(c.andThen(c1));
  }
}
