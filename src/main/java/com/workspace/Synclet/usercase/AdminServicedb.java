package com.workspace.Synclet.usercase;

import com.workspace.Synclet.model.Admin;
import com.workspace.Synclet.repository.AdminRepository;
import com.workspace.Synclet.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServicedb implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin getAdminById(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public Admin getAdminByMail(String mail) {
        return adminRepository.findByMail(mail);
    }

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }
}
