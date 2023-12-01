/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author skndr
 */
public interface AdminRepository extends JpaRepository<Admin , Integer>{
    public Admin findById(int id);
}
