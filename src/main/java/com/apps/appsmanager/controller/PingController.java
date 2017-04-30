///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.apps.appsmanager.controller;
//
//import com.apps.appsmanager.dao.BankService;
//import com.apps.appsmanager.dto.AccountDetails;
//import com.apps.model.Address;
//import com.apps.model.Customer;
//import com.apps.appsmanager.dto.CustomerDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author MY PC
// */
//@RestController
//@RequestMapping("/v")
//public class PingController {
// 
//    @Autowired
//    BankService bankService;
//    
//    
//    
//    
//    
//    
//    @RequestMapping(value = "/do", method = RequestMethod.GET)
//    @ResponseBody
//    public String pingPong()
//    {
//        return "pong";
//        
//    }
//    
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    @ResponseBody
//    public Customer save()
//    {
//        
//            
//        
//        Customer cus = new Customer();
//        cus.setCustomerName("name");
//        cus.setCustomerSurName("surname");
//        cus.setEmailId("emailId");
//        cus.setPassword("password");
//       
//        Address add = new Address();
//        add.setCity("city");
//        add.setPincode(63736);
//        cus.setAddress(add);
//        
//        AccountDetails account = new AccountDetails();
//        account.setAccountBranch("accountBranch");
//        account.setAccountNumber("accountNumber");
//        account.setAccountType("accountType");
//        account.setIfscCode("ifsccode");
//        account.setAmount(100000);
//        
//        bankService.save(cus);
//        return cus;
//    }
//    
//    
//   
//    
//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    @ResponseBody
//    public Customer create(@RequestBody CustomerDto cusdto)
//    {
//        Customer cus = new Customer();
//        cus.setCustomerName(cusdto.getCustomerName());
//        cus.setCustomerSurName(cusdto.getCustomerSurName());
//        Address add = new Address();
//        add.setCity(cusdto.getAddress().getCity());
//        
//        cus.setAddress(add);
//        
//        return  cus;
//        
//    }
//    
//    
//    
//    
//}
