package org.example.sem5.task1.controller;

import org.example.sem5.task1.model.Group;
import org.example.sem5.task1.model.Student;
import org.example.sem5.task1.model.Teacher;
import org.example.sem5.task1.service.UserService;
import org.example.sem5.task1.view.GroupView;
import org.example.sem5.task1.view.StudentView;
import org.example.sem5.task1.view.TeacherView;

public class Controller {
    private UserService userService;
    private StudentView studentView;
    private TeacherView teacherView;
    private GroupView groupView;

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
        this.teacherView = new TeacherView();
        this.groupView = new GroupView();
    }

    public Student createStudent(Student student) {
        return (Student)userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public void printStudent(Student student) {
        studentView.printStudent(student);
    }

    public void printTeacher(Teacher teacher) { teacherView.printTeacher(teacher);
    }

    public void printGroup(Group group) { groupView.printGroup(group);
    }

    public void returnStudents() {
        userService.read();
    }


}
