package pointers;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> map1 = new HashMap<>();
    HashMap<String, Integer> map2 = new HashMap<>();

    map1.put("Name", 29);

    map2 = map1;

    map1.put("Name", 40);
    System.out.println(map1);
    System.out.println(map2);
  }
}
