package chapter11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> map =
        Map.of("사과", 3, "바나나", 5, "배", 1);
    System.out.println(map.size()+"종류의 과일이 있습니다.");
    System.out.println(map);

    Map<String,Integer> hashMap = new HashMap<>(map);

    System.out.println("map == hashMap ? " + map.equals(hashMap));


    hashMap.put("딸기",10);
    System.out.println(hashMap);
    hashMap.put("사과",20);
    System.out.println(hashMap);
    hashMap.forEach((k,v)->System.out.println(k+" : "+v));
  }
}
