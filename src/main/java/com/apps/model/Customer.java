/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author suraj ganti
 */
@Entity
@Table(name = "customer")
@Setter
@Getter
public class Customer implements Serializable {

    @Id
    @Column(name="customerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="emailid")
    private String emailId;
    
    @Column(name="password")
    private String password;
   
    @Column(name="dob")
    private String dob;

    
    
    
    @Column(name="customername")
    private String customerName;
    
    @Column(name="customersurname")
    private String customerSurName;
    
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
    private AccountDetails accountdetails;
   
    
    
}
