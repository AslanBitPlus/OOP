package org.example.sem5.task1.service;

import org.example.sem5.task1.model.Student;
import org.example.sem5.task1.model.Teacher;
import org.example.sem5.task1.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    List<User> listUser;

    public UserService() {
        this.listUser = new ArrayList<>();
    }

    @Override
    public User create(User user) {
        if (user instanceof Student) {
            int id = maxStudentId();
            listUser.add(new Student(user.getName(), user.getSecondName(), user.getYear(), id));
        } else {
            int id = maxTeacherId();
            listUser.add(new Teacher(user.getName(), user.getSecondName(), user.getYear(), id));
        }
        return listUser.get(listUser.size() - 1);

    }


    private int maxStudentId() {
        int result = 0;
        for (int i = 0; i < listUser.size() - 1; i++) {
            if (listUser.get(i) instanceof Student) {
                return i + 1;
            }
        }
        return 0;
    }

    private int maxTeacherId() {
        int result = 0;
        for (int i = 0; i < listUser.size() - 1; i++) {
            if (listUser.get(i) instanceof Teacher) {
                return i + 1;
            }
        }
        return 0;
    }

    @Override
    public List<User> read() {
        return null;
    }
    //

}
