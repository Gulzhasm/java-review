package org.example.review;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        students.add(new Student("Mike", 1));
        students.add(new Student("Mike", 2));
        students.add(new Student("Last", 3));

        teachers.add(new Teacher("Teacher", 1));

        Utils<Student> studentUtils = new Utils<>();
        Utils<Teacher> teacherUtils = new Utils<>();
        studentUtils.printInfo(students);
        teacherUtils.printInfo(teachers);
        System.out.println(studentUtils.lastElement(students));
    }

}
