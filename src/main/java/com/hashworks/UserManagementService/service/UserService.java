package com.hashworks.UserManagementService.service;


import com.hashworks.UserManagementService.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    User findOne(long id);
    void delete(long id);
}