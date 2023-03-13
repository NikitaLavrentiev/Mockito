package me.test.mockito.services;

import me.test.mockito.dao.UserDao;
import me.test.mockito.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}