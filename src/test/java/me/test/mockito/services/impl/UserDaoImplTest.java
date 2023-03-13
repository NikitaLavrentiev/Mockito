package me.test.mockito.services.impl;

import me.test.mockito.dao.UserDao;
import me.test.mockito.model.User;
import me.test.mockito.services.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserDao dao;
    @InjectMocks
    private UserServiceImpl out;


    @Test
    void checkUserExist_existingUser_returnsTrue() {
        User existingUser = new User("Джим", 1998);
        when(dao.getUserByName(existingUser.getName())).thenReturn(existingUser);
        assertTrue(out.checkUserExist(existingUser));
    }

    @Test
    void checkUserExist_nonExistingUser_returnsFalse() {
        User nonExistingUser = new User("Коля", 1994);
        when(dao.getUserByName(nonExistingUser.getName())).thenReturn(null);
        assertFalse(out.checkUserExist(nonExistingUser));
    }
}