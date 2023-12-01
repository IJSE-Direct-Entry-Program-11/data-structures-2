import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>(20, 0.9f);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("ijse", 2023);
        map.put("dep", 11);
        map.put("dep", 15);
        map.put("gdse", 62);
        System.out.println(map.size());
        System.out.println(map.containsKey("dep"));     // O(1) <- Constant Time
        System.out.println(map.containsValue(62));      // O(n) <- Linear Time
        System.out.println(map.get("ijse"));            // O(1)
        System.out.println(map.get("something"));
        System.out.println(map.getOrDefault("something", 10));   // since 1.8
        System.out.println("-------------------");
        for (String key : map.keySet()) {
            System.out.printf("%s: %s \n", key, map.get(key));
        }
        System.out.println("-------------------");
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}
