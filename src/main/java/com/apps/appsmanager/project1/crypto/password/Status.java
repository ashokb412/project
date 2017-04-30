/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.crypto.password;

import com.apps.appsmanager.project1.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author suraj ganti
 */
@Setter
@Getter
public class Status {
    
    private String status;
    private String token;
    private boolean statusIsActive;
    private String message;
    private String email;
    
    private UserDTO data;
    
    public Status(){
        
    }

    public Status(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Status(boolean statusIsActive, String message) {
        this.statusIsActive = statusIsActive;
        this.message = message;
    }

    public Status(String status, String token, boolean statusIsActive, String message) {
        this.status = status;
        this.token = token;
        this.statusIsActive = statusIsActive;
        this.message = message;
    }

    public Status(String status, String token, boolean statusIsActive, String message, String email) {
        this.status = status;
        this.token = token;
        this.statusIsActive = statusIsActive;
        this.message = message;
        this.email = email;
    }

    public Status(String status, String token, boolean statusIsActive, String message, String email, UserDTO data) {
        this.status = status;
        this.token = token;
        this.statusIsActive = statusIsActive;
        this.message = message;
        this.email = email;
        this.data = data;
    }
    
    
    
    
}
