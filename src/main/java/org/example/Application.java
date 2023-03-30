package org.example;

import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("T", "P", 1),
                new Student("A", "n", 2),
                new Student("M", "T", 3),
                new Student("J", "R", 4),
                new Student("N", "M", 5)
        );

        List<Teacher> teachers = List.of(
                new Teacher("O", "H", 1),
                new Teacher("A", "N", 1),
                new Teacher("T", "P", 1)
        );

        students.forEach(System.out::println);
        teachers.forEach(System.out::println);
    }
}
