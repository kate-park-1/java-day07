package exercise11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 22));
    set.add(new Person("나자바", 22));

    Iterator<Person> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person other = (Person) obj;
      if (other != null && hashCode() == other.hashCode()) {
        return true;
      }
    }
    return false;
  }
  @Override
  public String toString() {
    return "Person[" + name + ':' + age + ']';
  }
}




