package org.example.dao;

import org.example.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    @Test
    void saveAndGetAndDelete() {
        User user = new User("test_login", "test_pass", "test_fn", "test_ln", "test_email", "test_phone");
        UserDAO.save(user);

        User userFromDB = UserDAO.findById(user.getId());
        assertNotNull(userFromDB);
        assertEquals(user.getLogin(), userFromDB.getLogin());

        UserDAO.delete(userFromDB);
    }

}