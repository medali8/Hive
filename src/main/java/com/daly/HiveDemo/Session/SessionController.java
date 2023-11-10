/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daly.HiveDemo.Session;

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
    
    
}
