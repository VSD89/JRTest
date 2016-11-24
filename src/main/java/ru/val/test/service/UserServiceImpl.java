package ru.val.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.val.test.dao.UserDao;
import ru.val.test.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        this.userDao.editUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        this.userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public User getUser(Integer id) {
        return this.userDao.getUser(id);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return this.userDao.listUsers();
    }
}
