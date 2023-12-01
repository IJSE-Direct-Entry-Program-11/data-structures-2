import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {
        TreeMap<Customer, Integer> myMap = new TreeMap<>();
        Customer c1 = new Customer(10, "Kasun");
        Customer c2 = new Customer(2, "Nuwan");

        System.out.println(c1.compareTo(c2));

//        Customer c3 = new Customer(5, "Ruwan");
//        Customer c2Copy = new Customer(2, "Nuwan");
        myMap.put(c1, 10);
//        myMap.put(c2, 20);
//        myMap.put(c3, 20);
//        myMap.put(c2Copy, 30);
//        System.out.println(myMap);
    }

    static class Customer implements Comparable<Customer>{
        int id;
        String name;

        @Override
        public int compareTo(Customer c) {
            if (c.id == id) return 0;
            if (id > c.id) return 1;
            else return -1;
        }

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "C-" + id;
        }
    }
}
