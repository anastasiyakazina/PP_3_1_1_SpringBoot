package com.example.pp_3_1_1_springboot.service;

import com.example.pp_3_1_1_springboot.model.User;


import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteById(Long id);

    void updateUser(User user);

    User findById(Long id);

}
