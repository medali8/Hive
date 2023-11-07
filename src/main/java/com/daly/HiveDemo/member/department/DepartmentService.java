/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.member.department;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author skndr
 */
public interface DepartmentService {
    
    public Department save(Department d);
    public List<Department> findAllDepartment();
    public Department findById(int id);
    public void deleteDepartmentById(int id);
    public Department updateById(int id,Department d);

    
    
}
