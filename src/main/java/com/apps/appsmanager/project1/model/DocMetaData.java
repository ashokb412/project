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

/**
 *
 * @author suraj ganti
 */
@Setter
@Getter
@Entity
@Table(name="document_metaData")
public class DocMetaData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "document_id")
    private String documentId;

    @Column(name = "document_Type")
    private String documentType;

    @Column(name = "uploaded_date")
    private String uploadedDate;

    @Column(name = "proof_Type")
    private String proof;

    @Column(name = "document_url")
    private String url;

}


