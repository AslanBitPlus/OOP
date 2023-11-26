package org.example.sem5.task1;

import org.example.sem5.task1.controller.Controller;
import org.example.sem5.task1.model.Student;
import org.example.sem5.task1.view.StudentView;

public class Main {
    public static void main(String[] args) {
        // StudentView studentView = new StudentView();
        // studentView.printStudent(new Student("Иван","Иванов", 23, 5));
        Controller controller = new Controller();
        Student student = controller.createStudent(new Student("Иван","Иванов", 23, 1));
        controller.returnStudents();
        controller.printStudent(student);

    }
}
