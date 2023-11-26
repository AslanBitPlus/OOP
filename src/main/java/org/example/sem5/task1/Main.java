package org.example.sem5.task1;

import org.example.sem5.task1.controller.Controller;
import org.example.sem5.task1.model.Group;
import org.example.sem5.task1.model.Student;
import org.example.sem5.task1.model.Teacher;
import org.example.sem5.task1.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // StudentView studentView = new StudentView();
        // studentView.printStudent(new Student("Иван","Иванов", 23, 5));
        Controller controller = new Controller();
        Student student1 = controller.createStudent(new Student("Иван","Иванов", 23, 1));
        Student student2 = controller.createStudent(new Student("Сергей","Петров", 22, 2));
        Student student3 = controller.createStudent(new Student("Михаил","Сидоров", 20, 3));
        Student student4 = controller.createStudent(new Student("Гена","Васильев", 21, 4));

        Teacher teacher = controller.createTeacher(new Teacher("Василий", "Михайлов", 45, 2));
        controller.returnStudents();

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Group group = new Group(1, teacher, list);
        System.out.println("group = " + group);

    }
}
