/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author suraj ganti
 */
@Getter
@Setter
@Data
@Entity
@Table(name= "user_Info")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Column(name="tap_id")
    private String tapId;
    
    @Column(name="firstName")
    private String firstName;
    
    @Column(name="lastName")
    private String lastName;
    
    @Column(name="emailId")
    private String emailId;
    
    @Column(name="phoneNumber")
    private String phoneNumber;
    
    @Column(name="password")
    private String password;
    
    @Column(name="address")
    private String address;
    
    @Column(name="role")
    private String role;
    
    
    
    @Column(name="interest")
    private String interest;
    
     @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    private List<ContactDetails> contactDetails;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    private List<BankDetails> bankDetails;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    private List<Location> locationDetails;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    private List<BusinessLocation> BusinessLocationDetails;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    private List<Role> roleList;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {javax.persistence.CascadeType.ALL})
    private List<Document> document;

       
}
