package org.example.sem5.task1.service;

import org.example.sem5.task1.model.Group;
import org.example.sem5.task1.model.Student;
import org.example.sem5.task1.model.Teacher;
import org.example.sem5.task1.model.User;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private Integer id;
    List<Student> listStudents;

    public GroupService(Integer id, Teacher teacher,List<Student> listStudents) {
        this.id = id;
        // this.teacher = teacher;
        this.listStudents = new ArrayList<>();
    }


}
