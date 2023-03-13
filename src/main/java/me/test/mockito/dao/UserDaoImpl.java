package me.test.mockito.dao;

import me.test.mockito.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    public final List<User> userList = List.of(
            new User("Маша", 1994),
            new User("Георгий", 1999),
            new User("Женя", 1996),
            new User("Иван", 1993));


    @Override
    public User getUserByName(String name) {
        for (User user: userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return userList;
    }
}
