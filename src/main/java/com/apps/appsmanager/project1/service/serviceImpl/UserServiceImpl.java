/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.service.serviceImpl;

import com.apps.appsmanager.project1.dao.daoImpl.UserDAO;
import com.apps.appsmanager.project1.dto.BusinessLocationDTO;
import com.apps.appsmanager.project1.dto.SocialAccountDTO;
import com.apps.appsmanager.project1.dto.UserDTO;
import com.apps.appsmanager.project1.model.BankDetails;
import com.apps.appsmanager.project1.model.BusinessLocation;
import com.apps.appsmanager.project1.model.ContactDetails;
import com.apps.appsmanager.project1.model.Email;
import com.apps.appsmanager.project1.model.Location;
import com.apps.appsmanager.project1.model.Mobile;
import com.apps.appsmanager.project1.model.SocialAccount;
import com.apps.appsmanager.project1.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author suraj ganti
 */
@Service
public class UserServiceImpl implements UserService {

 @Autowired
 private UserDAO userDao;

 @Override
 @Transactional
 public User addUser(UserDTO userDto) {

  //UserData  
  User user = new User();
  user.setFirstName(userDto.getFirstName());
  user.setLastName(userDto.getLastName());
  user.setAddress(userDto.getAddress());
  user.setEmailId(userDto.getEmail());
  user.setPhoneNumber(userDto.getPhoneNumber());
  user.setRole(userDto.getRole());
  user.setPassword(userDto.getPassword());
  user.setInterest(userDto.getInterest());

  //User Contacts
  ContactDetails contact = new ContactDetails();
  Mobile mobile = new Mobile();
  if (userDto.getMobile() != null) {
   mobile.setAddresdBook(userDto.getMobile().getAddressBook());
   mobile.setSkype(userDto.getMobile().getSkype());
   mobile.setWhatsApp(userDto.getMobile().getWhatsApp());

  }

  List < Mobile > mobileNumber = new ArrayList < Mobile > ();
  mobileNumber.add(mobile);

  //Emails
  Email email = new Email();
  if (userDto.getEmails() != null) {
   email.setGmail(userDto.getEmails().getGmail());
   email.setHotmail(userDto.getEmails().getHotmail());
   email.setYahoo(userDto.getEmails().getYahoo());
  }

  List < Email > emailList = new ArrayList < Email > ();
  emailList.add(email);

  //SocilaContacts
  List < SocialAccount > socialList = new ArrayList < > ();
  List < SocialAccountDTO > socialDtoList = userDto.getSocial();
  if (socialDtoList != null) {
   for (SocialAccountDTO socialAccountDto: socialDtoList) {
    SocialAccount social = new SocialAccount();
    social.setAccountName(socialAccountDto.getAccountName());
    social.setAccountType(socialAccountDto.getAccountType());
    social.setUrl(socialAccountDto.getUrl());
    social.setContactDetails(contact);
    socialList.add(social);
   }

   //Contact Details
   contact.setMobile(mobileNumber);
   contact.setEmail(emailList);
   contact.setSocialAccountList(socialList);
   email.setContactDetails(contact);
   mobile.setContactDetails(contact);
   contact.setUser(user);
   List < ContactDetails > contactList = new ArrayList < > ();
   contactList.add(contact);
   user.setContactDetails(contactList);


   //Location 
   Location location = new Location();
   location.setCountry(userDto.getCurrentLocation().getCountry());
   location.setCity(userDto.getCurrentLocation().getCity());
   location.setState(userDto.getCurrentLocation().getState());
   location.setUser(user);
   List < Location > locationList = new ArrayList < > ();
   locationList.add(location);
   user.setLocationDetails(locationList);

   //Business Location
   List < BusinessLocation > businessLocationList = new ArrayList < > ();
   List < BusinessLocationDTO > businessLocationDtoList = userDto.getBusinessLocation();
   if (businessLocationDtoList != null) {
    for (BusinessLocationDTO businessLocationDTO: businessLocationDtoList) {
     BusinessLocation business = new BusinessLocation();
     business.setCountry(businessLocationDTO.getCountry());
     business.setState(businessLocationDTO.getState());
     business.setCity(businessLocationDTO.getCity());
     business.setUser(user);
     businessLocationList.add(business);
    }

   }
   user.setBusinessLocationDetails(businessLocationList);

   //user bank account details
   BankDetails bank = new BankDetails();
   bank.setAccountNumber(userDto.getBankPayment().getAccountNo());
   bank.setBankName(userDto.getBankPayment().getBankName());
   bank.setCountryName(userDto.getBankPayment().getCountryName());
   bank.setNameOfAccount(userDto.getBankPayment().getNameOfAccount());
   bank.setPaypalEmail(userDto.getBankPayment().getPaypalEmail());
   bank.setIfsc(userDto.getBankPayment().getIfsc());
   bank.setUser(user);
   List < BankDetails > bankList = new ArrayList < > ();
   bankList.add(bank);
   user.setBankDetails(bankList);
  }
  userDao.addUser(user);
  return user;

 }

 @Override
 @Transactional
 public boolean alreadyExists(String emailID, String phoneNumber) {

  return userDao.alreadyExists(emailID, phoneNumber);
 }

 

 @Override
 @Transactional
 public List < UserDTO > getUserList() {
  return userDao.getUserList();
 }







}