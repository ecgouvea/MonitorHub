package sample;

public class StaticFieldConcurrencyMain {

  private String s = "";

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Thread t = new Thread(new StaticFieldConcurrencyMain().new Task());
      t.start();
    }
  }

  private class Task implements Runnable {

    @Override
    public void run() {
      s = Thread.currentThread().getName() + "; ";
      try {
        Thread.sleep(2_000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(s);
    }
  }
}
