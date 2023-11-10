/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.member.department;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author skndr
 */
public interface DepartmentRepository extends JpaRepository <Department,Integer> {
  
    public Department findById(int id);
    
}
