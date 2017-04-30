/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.service.serviceImpl;

import com.apps.appsmanager.project1.dto.UserDTO;
import com.apps.appsmanager.project1.model.User;
import java.util.List;

/**
 *
 * @author suraj ganti
 */
public interface UserService {
    
    public User addUser(UserDTO userDto);
    
    public boolean alreadyExists(String email,String phoneNumber);
    
    public User getUserByEmailId(String emailId);
    
    public List<User> getUserList(Integer numberOfUsers);
}
