/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

/**
 *
 * @author suraj ganti
 */
@Getter
@Setter
@Entity
@Table(name="Token_Key")
public class TokenKey implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tokenId")
    private Integer tokenId;

    @Column(name = "generatedToken", columnDefinition = "varchar(500)")
    private String generatedToken;

    @Column(name = "createdDate")
    private String createdDate;

    @Column(name = "updatedDate")
    private String modifyDate;

    @Column(name = "Token_status")
    private String status;

    @Column(name = "Enable_Disable")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean enableDisable;

    @Column(name = "userId")
    private String userId;

    public TokenKey() {
    }

    public TokenKey(Integer tokenId, String generatedToken, String createdDate, String modifyDate, String userId) {
        this.tokenId = tokenId;
        this.generatedToken = generatedToken;
        this.createdDate = createdDate;
        this.modifyDate = modifyDate;
        this.userId = userId;
    }

    public TokenKey(String generatedToken) {
        this.generatedToken = generatedToken;
    }

}
