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

    public Session() {
    }

    public Session(int id_sess, String context, String DateTime) {
        this.id_sess = id_sess;
        this.context = context;
        this.DateTime = DateTime;
    }

    public int getId_sess() {
        return id_sess;
    }

    public void setId_sess(int id_sess) {
        this.id_sess = id_sess;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }
    
    
}
