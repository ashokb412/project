/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Tapreward
 */
@Data
@Setter
@Getter
public class SocialAccountDTO {

  

    private String accountName;

    private String accountType;

    private String url;

//    private String faceBook;
//    private String instagram;
//    private String linkedin;
//    private String twitter;
//


}
