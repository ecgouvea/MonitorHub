package sample.guess.content.type;

import java.net.URLConnection;

public class GuessContentTypeMain {

  public static void main(String[] args) {
    String mimeType = URLConnection.guessContentTypeFromName("abc.mpeg");
    System.out.println(mimeType);
  }
}
