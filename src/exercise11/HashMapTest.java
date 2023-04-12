package exercise11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
  public static void main(String[] args) {
    Map<String, String> map = Map.of("호랑이","tiger","표범","leopard","사자","lion");
    HashMap<String, String> hashMap = new HashMap<>(map);
    System.out.println("변경전 : " + hashMap);
    hashMap.replaceAll((k, v) -> v.toUpperCase());
    System.out.println("변경후 : " + hashMap);
  }
}
