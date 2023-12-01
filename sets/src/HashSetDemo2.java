import java.util.HashSet;
import java.util.Objects;

public class HashSetDemo2 {

    public static void main(String[] args) {
        HashSet<Customer> mySet = new HashSet<>();
        mySet.add(new Customer(1, "Kasun"));
        mySet.add(new Customer(2, "Nuwan"));
        mySet.add(new Customer(3, "Ruwan"));
        mySet.add(new Customer(1, "Kasun"));
        for (Customer customer : mySet) {
            System.out.println(customer);
        }
    }

    static class Customer {
        int id;
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return id == customer.id && Objects.equals(name, customer.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
