/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.controller;

import com.apps.appsmanager.project1.crypto.password.Status;
import com.apps.appsmanager.project1.dto.UserDTO;
import com.apps.appsmanager.project1.model.User;
import com.apps.appsmanager.project1.service.serviceImpl.UserService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author suraj ganti
 */

@RestController
@RequestMapping("/api")
public class RegistrationController {
   
   final static Logger logger=Logger.getLogger(RegistrationController.class );
    
    @Autowired
    private UserService userservice;
    
    @RequestMapping(value =" /register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Status> addUser(@RequestBody UserDTO userDto){
        
        logger.info("Requested Json for Registration =======> " + userDto);
        Status status= null;
        
        if(userDto != null){
            
            if(!(userservice.alreadyExists(userDto.getEmail(), userDto.getPhoneNumber()))){
          User responseUser = userservice.addUser(userDto);
          
          status =new Status("success", "12234", true, "user has registered", "email", userDto);  
    return new ResponseEntity<>(status, HttpStatus.OK);          
        }else{
                logger.error("EmailID already Exists, Enter New EmailID");
          //status = new Status("fail", "token", true, " inavlid ", "email", userDto);
          return new ResponseEntity<>(status, HttpStatus.NO_CONTENT); 
        }
    } else{
         return new ResponseEntity<>(new Status("error", "Empty Data"), HttpStatus.NO_CONTENT);   
        }
       
}  
       
       
  
   @RequestMapping(value="/usersList", method = RequestMethod.GET)
   @ResponseBody
   public List<UserDTO> getUserList(){
     List<UserDTO>  userlist = userservice.getUserList();
       return userlist;
       
     
   }
   
}