package com.example.PP_3_1_springboot_new.dao;

import com.example.PP_3_1_springboot_new.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Integer>{

}
