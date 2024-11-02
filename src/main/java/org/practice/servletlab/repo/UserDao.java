package org.practice.servletlab.repo;

import org.practice.servletlab.models.User;

public interface UserDao {
    User findByUsernameAndPassword(String username, String password);
    User findByEmailAndPassword(String email, String password);
    void save(User user);
    User findByEmail(String email);
    User findByUsername(String username);
}
