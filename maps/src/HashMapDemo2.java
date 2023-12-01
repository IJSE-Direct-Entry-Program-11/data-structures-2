import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo2 {

    public static void main(String[] args) {
        HashMap<Customer, Integer> myMap = new HashMap<>();
        Customer c1 = new Customer(1, "Kasun");
        Customer c2 = new Customer(2, "Nuwan");
        Customer c3 = new Customer(3, "Ruwan");
        Customer c1Copy = new Customer(1, "Kasun");
        System.out.println(c1.hashCode() == c1Copy.hashCode());
        System.out.println(c1.equals(c1Copy));
        myMap.put(c1, 10);
        myMap.put(c2, 20);
        myMap.put(c1Copy, 30);
        myMap.put(c3, 10);
        System.out.println(myMap);
    }

    // @Data = @Getter + @Setter + @ToString + @EqualsAndHashCode
    // @EqualsAndHashCode
    static class Customer {
        int id;
        String name;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Customer customer = (Customer) o;
//            return id == customer.id && Objects.equals(name, customer.name);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(id, name);
//        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(id, name);
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//            Customer c = (Customer) obj;
//            return c.id == id && c.name.equals(name);
//        }

        @Override
        public String toString() {
            return "C" + id;
        }
    }
}
