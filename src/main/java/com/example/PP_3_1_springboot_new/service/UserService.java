package com.example.PP_3_1_springboot_new.service;

import com.example.PP_3_1_springboot_new.dao.UserDAO;
import com.example.PP_3_1_springboot_new.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public User saveUser(User user) {
        return userDAO.save(user);
    }

    public User getUser(Integer id) {
        return userDAO.findById(id).orElse(null);
    }

    public void deleteUser(Integer id) {
        userDAO.deleteById(id);
    }
}
