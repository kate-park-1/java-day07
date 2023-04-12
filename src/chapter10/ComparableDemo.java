package chapter10;

import java.util.Arrays;

public class ComparableDemo {
  public static void main(String[] args) {
    String[] array = {"a", "b", "c", "d", "e"};
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));

    Integer[] integers = { 10, 20, 30, 40}    ;
    Arrays.sort(integers);
    System.out.println(Arrays.toString(integers));

    Rectangle[] rectangles = { new Rectangle(10, 20),
                               new Rectangle(30, 40),
                               new Rectangle(50, 60) };
    Arrays.sort(rectangles);
    for (Rectangle r : rectangles) {
      System.out.println(r);
    }
  }
}
