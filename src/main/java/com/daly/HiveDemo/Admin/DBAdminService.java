/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Admin;

import com.daly.HiveDemo.*;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author skndr
 */
@Service
public class DBAdminService implements AdminService{
    private final AdminRepository repo;
    public DBAdminService(AdminRepository r){
        this.repo = r ;
    }
    @Override
    public List<Admin> getAll(){
        return repo.findAll();
    }
    @Override
    public Admin save(Admin a){
        return this.repo.save(a);
    }
    @Override
    public Admin getById(int id){
        return this.repo.findById(id);
    }
    @Override
    public void deleteById(int id){
        this.repo.deleteById(id);
    }
    @Override
    public Admin update(Admin a){
        Admin existantAdmin = this.repo.findById(a.getId());
        existantAdmin.setNom_ad(a.getNom_ad());
        existantAdmin.setPrenom_ad(a.getPrenom_ad());
        existantAdmin.setNum_tel(a.getNum_tel());
        existantAdmin.setCin(a.getCin());
        existantAdmin.setAdmin_type(a.getAdmin_type());
        existantAdmin.setEmail(a.getEmail());
        existantAdmin.setLogin(a.getLogin());
        existantAdmin.setPwd(a.getPwd());
        
        return this.repo.saveAndFlush(existantAdmin);
    }
    
    
    
    
}
