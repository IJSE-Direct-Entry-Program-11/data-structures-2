import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("ijse");
        mySet.add("esoft");
        mySet.add("iit");
        mySet.add("iit");
        mySet.add("iit");
        mySet.add("iit");
        mySet.add("abc");
        mySet.add("edf");
        System.out.println(mySet);
    }
}
