/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author suraj ganti
 */
@Setter
@Getter
@Data
@Entity
@Table(name="Bank_Details")
public class BankDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bank_Id")
    private Integer bankId;
    
    @Column(name="country_Name")
    private String countryName;
    
    @Column(name="name_Of_Account")
    private String nameOfAccount;
    
    @Column(name="bank_Name")
    private String bankName;
    
    @Column(name="ifsc_code")
    private String ifsc;
    
    @Column(name="account_Number")
    private String accountNumber;
    
    @Column(name="paypal_Email")
    private String paypalEmail;
    
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    
    
    public BankDetails(){
        
    }
}
