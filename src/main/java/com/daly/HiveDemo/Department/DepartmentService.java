/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.Department;

import java.util.List;

/**
 *
 * @author skndr
 */
public interface DepartmentService {
    
    public Department save(Department d);
    public List<Department> getAll();
    public Department getById(int id);
    public void delete(int id);
    public Department update(Department d);
    
}
