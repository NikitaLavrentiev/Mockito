package me.test.mockito.dao.impl;

import me.test.mockito.dao.UserDaoImpl;
import me.test.mockito.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserDaoImplTest {
    private final UserDaoImpl out = new UserDaoImpl();
    User u = new User("Маша", 2000);

    @Test
    void shouldReturnTrueWhenGetUserByName() {
        assertEquals(u, out.getUserByName(u.getName()));
    }

    @Test
    void shouldReturnNullWhenGetUserByName() {
        String randomName = "Встречавчетверг";
        assertNull(out.getUserByName(randomName));
    }
}