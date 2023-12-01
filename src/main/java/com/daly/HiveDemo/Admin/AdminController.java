/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Admin;

import com.daly.HiveDemo.*;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author skndr
 */
@RestController 
@RequestMapping("/api/admins")
public class AdminController implements AdminService {
    private final DBAdminService service ;
    public AdminController(DBAdminService service){
        this.service = service ;
    }
    
    @GetMapping
    @Override
    public List<Admin> getAll(){
        return this.service.getAll();
    }
    
    @PostMapping
    @Override
    public Admin save(@RequestBody Admin a){
        return this.service.save(a);
    }
    @GetMapping("/{id}")
    @Override
    public Admin getById(@PathVariable int id){
        return this.service.getById(id);
    }
    @PutMapping
    @Override
    public Admin update(@RequestBody Admin a){
        return this.service.update(a);
    }
    @DeleteMapping("/{id}")
    @Override
    public void deleteById(@PathVariable int id){
        this.service.deleteById(id);
    }
    
}
