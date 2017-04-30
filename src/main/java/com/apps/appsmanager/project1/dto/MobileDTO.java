/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;

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
public class MobileDTO {

    private String addressBook;
    private String skype;
    private String whatsApp;

    public MobileDTO() {
    }

}
