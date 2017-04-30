/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author suraj ganti
 */
@Entity
@Table(name="transaction")
public class Transaction implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String transactionId;
    
    @Column(name="")
    private AccountDetails accountByFromAcountNum;
    private AccountDetails accountByToAcountNum;
    private String transactionType;
    private double transactionAmount;
    private Date transactionDate;
    private String transactionstatus;
    
    
}
