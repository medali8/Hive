/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Session;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author skndr
 */

@RestController 
@RequestMapping("/api/sessions")
public class SessionController {

    private final SessionService service ;
    public SessionController(SessionService service){
        this.service = service ;
    }
    @PostMapping
    public Session save(
            @RequestBody Session s){
        return this.service.Save(s);
    }
    
    @GetMapping
    public List<Session> getAll(){
        return this.service.getAll();
    }
    
    @GetMapping("/{id}")
    public Session getById(
            @PathVariable int id){
        return this.service.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable int id){
        this.service.DeleteById(id);
    }
    
    @PutMapping
    public Session Update(@RequestBody Session s){
        return this.service.updateSession(s);
    }

    
    
    
}
