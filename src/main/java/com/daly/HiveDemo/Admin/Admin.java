/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author skndr
 */
@Entity
@Table(name="admin")
public class Admin {
    @Id
    private int id;
    
    @Column(name="nom_ad")
    private String nom_ad ;
    
    @Column(name="prenom_ad")
    private String prenom_ad;
    
    @Column(name="num_tel")
    private String num_tel ;
    
    @Column(name="cin_ad")
    private String cin ;
    
    @Column(name="email_ad")
    private String email;
    
    @Column(name="admin_type")
    private String admin_type;

    @Column(name="login_ad")
    private String login ;
    
    @Column(name="pwd")
    private String pwd ;
    
    private Admin(){
        
    }

    public Admin(int id, String nom_ad,String prenom_ad, String num_tel, String cin,String admin_type , String email , String login, String pwd) {
        this.id = id;
        this.nom_ad = nom_ad;
        this.prenom_ad=prenom_ad;
        this.num_tel = num_tel;
        this.cin = cin;
        this.admin_type = admin_type;
        this.email=email;
        this.login = login;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public String getPrenom_ad() {
        return prenom_ad;
    }
      public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdmin_type() {
        return admin_type;
    }

    public void setAdmin_type(String admin_type) {
        this.admin_type = admin_type;
    }
    public void setPrenom_ad(String prenom_ad) {
        this.prenom_ad = prenom_ad;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_ad() {
        return nom_ad;
    }

    public void setNom_ad(String nom_ad) {
        this.nom_ad = nom_ad;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
