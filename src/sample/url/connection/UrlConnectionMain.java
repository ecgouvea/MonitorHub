package sample.url.connection;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;

public class UrlConnectionMain {

  public static void main(String[] args) throws ProtocolException {
    String filePath =
        "/Users/egouvea/Downloads/Creatives Samples/appnexus_logo_video.mp4";
    System.out.println(filePath);
    File file = new File(filePath);
    System.out.println(String.valueOf(file.length()));
  }
}
