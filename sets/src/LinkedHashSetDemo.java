import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> mySet = new LinkedHashSet<>();
        mySet.add("ijse");
        mySet.add("dep");
        mySet.add("cmjd");
        mySet.add("ijse");
        mySet.add("gdse");
        System.out.println(mySet);
    }
}
