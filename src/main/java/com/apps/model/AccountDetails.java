/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author suraj ganti
 */
@Entity
@Table(name="accountdetails")
@Setter
@Getter
public class AccountDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accountdetailsID")
    private Long id;
    
    @Column(name="accountnumber")
    private String accountNumber;
    
    @Column(name="accountbranch")
    private String accountBranch;
    
    @Column(name="accounttype")
    private String accountType;
    
    @Column(name="amount")
    private double amount;
    
    @Column(name="ifsccode")
    private String ifscCode;
    
     @OneToOne(fetch = FetchType.LAZY)
     @PrimaryKeyJoinColumn
     private Customer customer;
}
