/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Department;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author skndr
 */
@Entity
@Table(name="department")
public class Department {
    
    @Id
    private int id_dep ;
    
    @Column(name="dep_name")
    private String dep_name;
    
    public Department(){
        
    }

    public Department(int id_dep, String dep_name) {
        this.id_dep = id_dep;
        this.dep_name = dep_name;
    }

    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
    
    
}
