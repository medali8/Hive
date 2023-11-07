/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member;

import java.util.List;

/**
 *
 * @author skndr
 */

public interface MemberService {
    public Member save(Member m);    
    public List<Member> findAllMembers();
    public Member findByCin(String cin);
    public void DeleteByCin(String cin);
    public Member updateMember(Member m);
        
    
    
}
