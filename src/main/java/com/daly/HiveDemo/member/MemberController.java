/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author skndr
 */
@RestController 
@RequestMapping("/api/members")
public class MemberController {
    
    private final MemberService service ;
    
    
    public MemberController(
     MemberService service
    ){
        this.service = service ;
    }

    @PostMapping 
    public Member save (@RequestBody Member m){
       return this.service.save(m);
    }
    @GetMapping("/{cin}")
    public Member findByCin(@PathVariable("cin") String cin){
        return this.service.findByCin(cin);
    }

    @GetMapping
    public List<Member> findAllMembers(){
        return this.service.findAllMembers() ;
    }
    @DeleteMapping("/{cin}")
    public void DeleteByCin(@PathVariable("cin") String cin){
        this.service.DeleteByCin(cin);
    }
    @PutMapping
    public Member updateMember(@RequestBody Member m){
        return this.service.updateMember(m);
    }

    
}



 
