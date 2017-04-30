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
@Table(name="mobile_contacts")
public class Mobile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobile_id")
    private Integer mobileId;


    @Column(name = "address_book")
    private String addresdBook;

 
    @Column(name = "skype_id")
    private String skype;

    @Column(name = "whatsApp_number")
    private String whatsApp;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private ContactDetails contactDetails;
    
    public Mobile() {
        
    }
    

}
