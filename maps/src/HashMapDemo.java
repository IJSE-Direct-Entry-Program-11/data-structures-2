import java.util.HashMap;
import java.util.Hashtable;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap);
        myMap.put("dep", 11);
        myMap.put("ijse", 2023);
        myMap.put("ijse", 2024);
        myMap.put("abc", 10);
        myMap.put("abc", 15);
        myMap.put("edf", 25);
        System.out.println(myMap);
    }
}
