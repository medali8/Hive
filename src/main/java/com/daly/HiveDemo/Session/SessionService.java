/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daly.HiveDemo.Session;

import java.util.List;

/**
 *
 * @author skndr
 */
public interface SessionService {
    public Session Save(Session s);
    public List<Session> getAll();
    public Session getById(int id);
    public void DeleteById(int id);
    public Session updateMember(Session m);
}
