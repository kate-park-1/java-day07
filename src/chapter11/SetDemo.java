package chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> a = Set.of("a", "b", "c");
    System.out.println(a);
    new TreeSet<String>().addAll(a);

    HashSet<String> h = new HashSet<>(a);
    System.out.println(h);

    HashSet<String> h2 = new HashSet<>(a);
    System.out.println(h2);

    h.add("a");
    h.add("d");
    System.out.println(h);
  }
}
