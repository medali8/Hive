/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member.department;

import java.util.List;
import java.util.Optional;
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
@RequestMapping("/api/departments")
public class DepartmentController {
        private final DepartmentService service ;


    public DepartmentController(com.daly.HiveDemo.member.department.DepartmentService service) {
        this.service = service;
    }
    
    
    
    
   
    @PostMapping
    public Department save(
            @RequestBody Department d){
        return this.service.save(d);
    }
    @GetMapping
    public List<Department> findAllDeparments(){
        return this.service.findAllDepartment();
    }
    
    @GetMapping("/{id}")
    public Department findById(
            @PathVariable("id") int id){
        return this.service.findById(id);
    }
    
    @PutMapping("/{id}")
    public Department updateById(
            @PathVariable("id") int id,
            @RequestBody Department d
    ){
            return this.service.updateById(id,d);
     }
    @DeleteMapping("/{id}")
    public void deleteById(
            @PathVariable("id") int id
    ){
        this.service.deleteDepartmentById(id);
    }
}