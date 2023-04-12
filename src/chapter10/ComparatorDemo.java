package chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
  public static void main(String[] args) {
    String[] strings = {"aasdlkjalskdjflaskdjfl",
                        "ealskdfjlaskdfjlakdsjfal",
                        "balskdjflakdsjfal"};
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.length() - o1.length();
      }
    });

    for (String s : strings) {
      System.out.println(s);
    }

    Arrays.sort(strings,  (o1, o2) -> o1.length() - o2.length());
    for (String s : strings) {
      System.out.println(s);
    }
  }

}
