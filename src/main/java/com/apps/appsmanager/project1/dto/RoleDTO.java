/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;

import lombok.Data;

/**
 *
 * @author Tapreward
 */
@Data
public class RoleDTO {

    private Integer roleId;
    private String firstName;
    private String roleName;
    private String role;

    public RoleDTO() {
    }

}
