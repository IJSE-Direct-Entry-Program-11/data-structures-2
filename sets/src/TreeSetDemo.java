import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(2, "Nuwan"));
        students.add(new Student(3, "Ruwan"));
        students.add(new Student(1, "Kasun"));
        students.add(new Student(2, "Supun"));
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static class Student implements Comparable<Student>{
        int id;
        String name;

        @Override
        public int compareTo(Student s) {
            if (s.id == id) return 0;
            else if (id > s.id) return 1;
            else return -1;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
