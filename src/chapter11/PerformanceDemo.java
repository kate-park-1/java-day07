package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
    int arrayValue = 0, linkedListValue = 0;
    for (int i = 0; i< 100000; i++) {
      arrayList.add(0,i);
    }
    for (int i = 0; i< 100000; i++) {
      linkedList.addFirst(i);
    }
    long start = System.nanoTime();
    for (int i = 0; i< 100000; i++) {
      arrayValue = arrayList.get(i);
    }
    long end = System.nanoTime();
    long duration = end - start;
    System.out.println("Arraylist get(index)에 걸린 시간 = " + duration);
    start = System.nanoTime();
    for (int i = 0; i< 100000; i++) {
      linkedListValue = linkedList.get(i);
    }
    end = System.nanoTime();
    duration = end - start;
    System.out.println("Linkedlist get(index) 에 걸린 시간 = " + duration);
  }
}
