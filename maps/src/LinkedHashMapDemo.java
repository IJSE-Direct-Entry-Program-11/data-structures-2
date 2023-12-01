import java.util.LinkedHashMap;
import java.util.Properties;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> myMap = new LinkedHashMap<>();
        myMap.put(10, "ijse");
        myMap.put(20, "dep");
        myMap.put(30, "nuwan");
        myMap.put(40, "kasun");
        myMap.put(50, "upul");
        System.out.println(myMap);
        myMap.remove(20);
        System.out.println(myMap);
        myMap.put(20, "esoft");
        System.out.println(myMap);
    }
}
