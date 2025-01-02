package com.workspace.Synclet.service;

import com.workspace.Synclet.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getUserById(int id);
    User getUserByMail(String mail);
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(int id);

}
