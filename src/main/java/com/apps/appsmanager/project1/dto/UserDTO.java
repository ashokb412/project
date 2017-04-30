/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dto;


import java.util.ArrayList;
import java.util.List;
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
public class UserDTO {

    private Integer id;
    private String tapId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String address;
    private String role;
    private String interest;
    private List<SocialAccountDTO> social = new ArrayList<>();
    private EmailDTO emails;
    private MobileDTO mobile;
    private BankDetailDTO bankPayment;
    private LocationDTO currentLocation;
    private List<BusinessLocationDTO> businessLocation;
    private IdentityProof identityProof;
    private AddressProofDTO addressProof;

    public UserDTO() {
    }
   
}
