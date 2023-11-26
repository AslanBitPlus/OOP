package org.example.sem5.task1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Integer id;
    private Teacher grTeacher;
    private List<Student> grStudents;

    public Group(Integer id, Teacher grTeacher, List<Student> grStudents) {
        this.id = id;
        this.grTeacher = grTeacher;
        this.grStudents = grStudents;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Student> getGrStudents() {
        return grStudents;
    }

    public void setGrStudents(List<Student> grStudents) {
        this.grStudents = grStudents;
    }

    @Override
    public String toString() {
        return "Учебная группа - id(" + id + ")\n" +
                "Преподаватель - '" + grTeacher + '\'' + "\n" +
                "-----------------------" + "\n" +
                "Список студентов - {" + grStudents +
                '}';
    }

    public Teacher getGrTeacher() {
        return grTeacher;
    }

    public void setGrTeacher(Teacher grTeacher) {
        this.grTeacher = grTeacher;
    }
}
