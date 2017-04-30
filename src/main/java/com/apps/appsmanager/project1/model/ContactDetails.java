/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Entity
@Table(name="Contact_Details")
public class ContactDetails implements Serializable {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer contactId;

    @OneToMany(mappedBy = "contactDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Mobile> mobile = new ArrayList<Mobile>();

    @OneToMany(mappedBy = "contactDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Email> email = new ArrayList<Email>();

    @OneToMany(mappedBy = "contactDetails", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SocialAccount> socialAccountList = new ArrayList<SocialAccount>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public ContactDetails() {
    }

}
