package com.workspace.Synclet.repository;

import com.workspace.Synclet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByMail(String mail);
}
