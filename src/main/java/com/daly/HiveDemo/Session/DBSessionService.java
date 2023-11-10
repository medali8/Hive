/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Session;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author skndr
 */
@Service()
public class DBSessionService implements SessionService{
    
    private final SessionRepository repo ;
    public DBSessionService(SessionRepository repo){
        this.repo = repo;
    }

    @Override
    public Session Save(Session s) {
        return this.repo.save(s);
    }

    @Override
    public List<Session> getAll() {
        return this.repo.findAll();
    }

    @Override
    public Session getById(int id) {
        return this.repo.getById(id);
    }

    @Override
    public void DeleteById(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public Session updateMember(Session s) {
        return s;
    }
    
}
