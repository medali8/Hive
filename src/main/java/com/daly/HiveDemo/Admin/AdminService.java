/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.Admin;

import java.util.List;

/**
 *
 * @author skndr
 */
public interface AdminService {
    public List<Admin> getAll();
    public Admin save(Admin a);
    public Admin getById(int i);
    public Admin update(Admin a);
    public void deleteById(int i);
    
}
