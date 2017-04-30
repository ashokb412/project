///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.apps.appsmanager.controller;
//
//import com.apps.appsmanager.dto.CustomerDto;
//import com.apps.appsmanager.service.BankService;
//import com.apps.model.Customer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author suraj ganti
// */
//@RestController
//@RequestMapping("/bank")
//public class CreateController {
//    
//    @Autowired
//    private BankService bankservice;
//    
//    @RequestMapping(value = " /create", method = RequestMethod.POST)
//    @ResponseBody
//    public Customer createAccount(@RequestBody CustomerDto customerDto){
//        Customer customer = bankservice.createCustomer(customerDto);
//        
//        return customer;
//    }
//    
//}
