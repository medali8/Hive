/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.member;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author skndr
 */
public interface MemberRepository extends JpaRepository<Member,String>{
    
    Member findByCin(String cin);
    void deleteByCin(String cin);
      
    
    
    
    
}
