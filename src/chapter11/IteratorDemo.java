package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
  public static void main(String[] args) {
      Collection<String> list = Arrays.asList("apple", "banana", "cherry");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("------------------");
    Iterator<String> iterator2 = list.iterator();
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
    System.out.println("------------------");
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
  }
}
