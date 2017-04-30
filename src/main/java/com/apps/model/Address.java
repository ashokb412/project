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
@Table(name="address")
@Setter
@Getter
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="addressID")
    private Long id;
    
    @Column(name="state")
    private String state;
    
    @Column(name="city")
    private String city;
    
    @Column(name="pincode")
    private int pincode; 
    
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Customer customer;
    
    
    
}
