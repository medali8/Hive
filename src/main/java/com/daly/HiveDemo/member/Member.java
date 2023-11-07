    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member;
import com.daly.HiveDemo.member.department.Department;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name="member")
public class Member {
    @Id
    public String cin ; 
    
    private String Fname ;
    
    private String Lname ;
    
    @Column(unique=true)
    private String PhoneNumber;
    
    @Column(unique=true)
    private String email; 
    
    @ManyToOne
    @JoinColumn(name = "id_dep")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    
    
    public String getCin_mem(){
        return this.cin ;
    }
    public void setCin_mem(String c){
        this.cin = c ;
    }
    

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    
    

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }
    
    

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   

    
    public Member(){
        
    }
    public Member(
            String cin_mem, String Fname, String Lname, String PhoneNumber, String email,Department d )
    {
        this.cin = cin_mem;
        this.Fname = Fname;
        this.Lname = Lname;
        this.PhoneNumber = PhoneNumber;
        this.email = email;
        this.department = d ;
    }
    
    
}
