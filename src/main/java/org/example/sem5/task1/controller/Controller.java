package org.example.sem5.task1.controller;

import org.example.sem5.task1.model.Student;
import org.example.sem5.task1.model.User;
import org.example.sem5.task1.service.UserService;
import org.example.sem5.task1.view.StudentView;

import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import java.util.List;

public class Controller {
    private UserService userService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student) {
        return (Student)userService.create(student);
    }

    public void printStudent(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}
