package sample.interfaces.enums;

public class InterfacesAndEnumsMain {

  interface I { void say(); }

  enum E implements I, I1 {
    E1, E2;

    @Override
    public void say() {
      System.out.println("Enum E says: -My name is " + name() + ".");
    }

    @Override
    public void ask() {
      System.out.println("Enum E says: -What is my name? It's " + name() + ".");
    }
  }

  interface I1 extends I { void say(); void ask(); }

  public static void main(String[] args) {
    E e = E.E1;
    e.say();
    e.ask();
    E.E1.say();
    E.E1.ask();
    E.E2.say();
    E.E2.ask();
  }
}
