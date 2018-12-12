package sample;

import java.util.LinkedList;
import java.util.List;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
  // T stands for "Type"
  private T t;

  public void set(T t) { this.t = t; }
  public T get() { return t; }

  public static void main(String[] args) {
    Box<String> box = new Box<String>();
    box.set("String");
    System.out.println("Box of " + box.get());

    Box<List> box1 = new Box<>();
    box1.set(new LinkedList());
    System.out.println("Box of " + box1.get().getClass());
  }
}

class Box1<SomeType> {
  // T stands for "Type"
  private SomeType t;

  public void set(SomeType t) { this.t = t; }
  public SomeType get() { return t; }
}
