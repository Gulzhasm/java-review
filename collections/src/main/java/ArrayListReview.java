package collections.src.main.java;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sahid"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Naymar"));

        System.out.println();
        System.out.println("for loop example ********************");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println();
        System.out.println("forEach loop example *********************");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        System.out.println("Iterator example ***********************");
        Iterator<Student> iterator = students.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("Backwards Iterator example *****************");

        while (((ListIterator<?>) iterator).hasPrevious()) {
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        System.out.println();
        System.out.println("Lambda expression example *****************");
        students.forEach(student -> System.out.println(student));

        System.out.println();
        System.out.println("Sorting elements in List example *****************");
        Collections.sort(students, new SortByIdDesc());
        System.out.println(students);

        System.out.println();
        System.out.println("Sorting name in List example *****************");
        Collections.sort(students, new SortByNameDesc());
        System.out.println(students);

    }

    static class SortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s2.id - s1.id;
        }
    }

    static class SortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s2.name.compareToIgnoreCase(s1.name);
        }
    }
}
