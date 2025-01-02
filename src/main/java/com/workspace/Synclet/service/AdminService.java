package com.workspace.Synclet.service;

import com.workspace.Synclet.model.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    Admin getAdminById(int id);
    Admin getAdminByMail(String mail);
    Admin addAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(int id);

    List<Admin> getAllAdmins();

}
