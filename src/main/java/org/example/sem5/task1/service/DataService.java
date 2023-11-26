package org.example.sem5.task1.service;

import java.util.List;

import org.example.sem5.task1.model.User;

public interface DataService {
    public User create(User user);
    List<User> read();


}
