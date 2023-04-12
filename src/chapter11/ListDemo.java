package chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals1 = {"dog", "cat1111", "bird"};
    List<String> list = Arrays.asList(animals1);  // fixed-size list 반환 - 추가 불가
    //list.set(1,"tiger"); // list.add("tiger");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
//    list.sort(new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//      }
//    });
    list.sort((o1, o2)-> o1.length() - o2.length());
    System.out.println(list);

    List<String> animals2 = List.of("dog", "cat", "bird"); // immutable list 반환 - 수정도 불가
    //animals2.set(1,"tiger");
    //animals2.sort((o1, o2)-> o1.length() - o2.length());
  }
}
