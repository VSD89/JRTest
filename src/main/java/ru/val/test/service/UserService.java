package ru.val.test.service;

import ru.val.test.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void editUser(User user);

    public void deleteUser(Integer id);

    public User getUser(Integer id);

    public List<User> listUsers();
}
