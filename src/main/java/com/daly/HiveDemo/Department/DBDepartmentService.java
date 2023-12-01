/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Department;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author skndr
 */
@Service
public class DBDepartmentService implements DepartmentService {
    private final DepartmentRepository repo ; 
    public DBDepartmentService(DepartmentRepository repo){
        this.repo= repo ;
    }

    @Override
    public Department save(Department d) {
        return this.repo.save(d);
    }

    @Override
    public List<Department> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Department getById(int id) {
        return this.repo.findById(id);
    }

    @Override
    public void delete(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public Department update(Department d) {
        Department existantDep = repo.findById(d.getId_dep());
        existantDep.setDep_name(d.getDep_name());
         return repo.saveAndFlush(existantDep);
    }
    
    
}
