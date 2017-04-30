/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Tapreward
 */
@Getter
@Setter
@Data
public class DocumentDTO implements Serializable{
    
    private String documentName;
    private String documentId;
    private String documentType;
    private String documentURL;

    public DocumentDTO() {
    }

    public DocumentDTO(String documentName, String documentId, String documentType, String documentURL) {
        this.documentName = documentName;
        this.documentId = documentId;
        this.documentType = documentType;
        this.documentURL = documentURL;
    }

   
    
    
}
