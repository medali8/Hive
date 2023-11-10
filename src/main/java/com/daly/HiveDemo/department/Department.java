/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member.department;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dep;
    
    @Column(name="dep_name")
    private String dep_name;
    
    public Department(){
        
    }
    public Department(int id , String dep_name){
        this.id_dep = id ;
        this.dep_name = dep_name;
    }
    public int getId_dep(){
        return this.id_dep;
    }
    public void setID_dep(int id){
        this.id_dep = id ;
    }
    public String getDep_name(){
        return this.dep_name ;
    }
    public void setDep_name(String d){
        this.dep_name=d;
    }
}
