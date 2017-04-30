/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dao.daoImpl;

import com.apps.appsmanager.project1.model.User;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author suraj ganti
 */
@Repository
public class UserDAOImpl implements UserDAO{
    
  final Logger logger = Logger.getLogger(UserDAOImpl.class );
 
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getSession(){
    return sessionFactory.getCurrentSession();
    }
    
    @Override
    public User addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user;
    }

    @Override
    public boolean alreadyExists(String email,String phoneNumber) {  
       List result= sessionFactory.getCurrentSession()
               .createQuery(" From User u where u.phoneNumber=:phoneNumber")
               .setParameter("phoneNumber", phoneNumber)
               .list();    
        return !result.isEmpty();
        
    }
    
    @Override
    public User getByEmail(String email) {
  
        User res = null;
        String hqlQuery="from User u where u.emailId =?";
        Query query=getSession().createQuery(hqlQuery);
        query.setParameter(0, email);
        List list=query.list();
        for (Object object : list) {
            User resEnitiy = (User) object;
            res = resEnitiy;
        }
        
        return res;
    }

    
}
 @Override
 public List < UserDTO > getUserList() {
  Query query = sessionFactory.getCurrentSession().createQuery("from User");

  UserDTO userDto = null;
  List < UserDTO > userDtoList = new ArrayList < > ();
  allUsers = query.list();
  for (Iterator < User > iterator = allUsers.iterator(); iterator.hasNext();) {

   User next = iterator.next();
   userDto = new UserDTO();
   userDto.setFirstName(next.getFirstName());
   userDto.setLastName(next.getLastName());
   userDto.setEmail(next.getEmailId());
   userDto.setAddress(next.getAddress());
   userDto.setInterest(next.getInterest());

   userDtoList.add(userDto);
  }

  System.out.println("com.apps.appsmanager.project1.dao.daoImpl.UserDAOImpl.getUserList()" + allUsers);

  return userDtoList;

 }

    @Override
    public User getUserByEmailId(String emailId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}