/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member.department;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


/**
 *
 * @author skndr
 */
@Service
public class DBDepratmentService implements DepartmentService{
    
    private final DepartmentRepository repo ;
    public DBDepratmentService(DepartmentRepository repo) {
           this.repo=repo;
    }
    
    

   
    @Override
    public Department save(Department d){
        return this.repo.save(d);
    }
    @Override
    public List<Department> findAllDepartment(){
        return this.repo.findAll();
    }
    
    
    @Override
    public Department findById(int id) {
        return this.repo.findById(id);
    }
        

    
    @Override
    @Transactional
    public void deleteDepartmentById(int id){
        this.repo.deleteById(id);
    }
    @Override
    @Transactional
    public Department updateById(int id , Department newDep){
        Department d = this.repo.findById(id);
        
        d.setDep_name(newDep.getDep_name());
        d.setID_dep(newDep.getId_dep());
        return repo.saveAndFlush(newDep);
        
                
                
                

    }
 
    
}
