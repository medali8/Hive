/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author skndr
 */
@Service()
public class DBMemberService implements MemberService{

   

    private final MemberRepository repo ;

    public DBMemberService(MemberRepository repo) {
        this.repo = repo;
    }
    @Override
    public Member save(Member m) {
        return repo.save(m);
    }

    @Override
    public List<Member> findAllMembers() {
        return repo.findAll();
    }

    @Override
    public Member findByCin(String cin) {
        return this.repo.findByCin(cin);
    }

    @Override
    @Transactional
    public void DeleteByCin(String cin) {
        this.repo.deleteByCin(cin);
    }

    @Override
    @Transactional
    public Member updateMember(Member m) {
            String cin = m.getCin();
    Member existingMember = repo.findByCin(cin);

    
        existingMember.setFname(m.getFname());
        existingMember.setLname(m.getLname());
        existingMember.setPhoneNumber(m.getPhoneNumber());
        existingMember.setEmail(m.getEmail());

        return repo.saveAndFlush(existingMember);
    
    
}
}
