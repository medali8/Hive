/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Department;

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
@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService service ;
    public DepartmentController(DepartmentService service){
        this.service=service;
    }
    @PostMapping
    public Department save(
            @RequestBody Department d){
        return this.service.save(d);
    }
    @GetMapping
    public List<Department> getAll(){
        return this.service.getAll();
    }
    @GetMapping("{id}")
    public Department getById(
            @PathVariable int id){
        return this.service.getById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(
            @PathVariable int id){
        this.service.delete(id);
    }
    @PutMapping
    public Department update(
            @RequestBody Department d){
        return this.service.update(d);
    }
    
}
