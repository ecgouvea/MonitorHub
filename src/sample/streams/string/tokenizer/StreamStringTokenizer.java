package sample.streams.string.tokenizer;

import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StreamStringTokenizer {

  public static void main(String[] args) {
    String mediaAssetIds = "123,A,234";
    Collections.list(new StringTokenizer(mediaAssetIds, ","))
      .stream()
      .map(token -> {
        String idAsString = String.valueOf(token);
        Integer id = null;

        try {
          id = Integer.valueOf(idAsString);
        } catch(Exception e) {
          System.out.println(e);
        }

        return id;
      })
      .peek(System.out::println)
      .collect(Collectors.toList());
  }
}
