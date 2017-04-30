/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Tapreward
 */
@Data
public class ContactDetailsDTO {

    private List<EmailDTO> email;
    private List<MobileDTO> mobile;
    private List<SocialAccountDTO> social;

    public ContactDetailsDTO() {
    }

}
