/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Session;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author skndr
 */
@Entity
@Table(name="session")
public class Session {
    
    @Id
    private int id_sess ;
    
    @Column(name="session_name")
    private String context;
    
    @Column(name="date_sess")
   private String DateTime ;
    
}
