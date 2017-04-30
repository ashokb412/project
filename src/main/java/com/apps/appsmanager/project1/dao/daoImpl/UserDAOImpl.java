/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dao.daoImpl;

import com.apps.appsmanager.project1.dto.UserDTO;
import com.apps.appsmanager.project1.model.User;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
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
    
    @Override
    public User addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user;
    }

    @Override
    public boolean alreadyExists(String email,String phoneNumber) {
//       String hql="SELECT * From User user where user.emailId:emailID and user.phoneNumber=:phoneNUmber";
//        Query query= sessionFactory.getCurrentSession().createQuery(hql);
//        query.setParameter(":emailID", hql);
//        query.setParameter(":phoneNumber", hql);
//         List result = query.list();
//        
       List result= sessionFactory.getCurrentSession()
                .createQuery(" From User u where u.phoneNumber=:phoneNumber")
               .setParameter("phoneNumber", phoneNumber)
               .list();
         
                  
        return !result.isEmpty();
        
    }
    
    @Override
    public User getUserByEmailId(String emailId) {
        User res = new User();
        //String SQL_QUERY = "FROM User u where u.emailId='" + emailId + "'";
        logger.info("i am at current Session:-==========>>>>>> : " + emailId);
        Query query = sessionFactory.getCurrentSession().createQuery("FROM User u where u.emailId=:emailID")
                                                        .setParameter("emailID", emailId);

        logger.info("DB returned Data==========>>>>>> : " + query);
        for (Iterator it = query.iterate(); it.hasNext();) {
            User user = (User) it.next();
            logger.info("From Iterater==========>>>>>> : " + user);
            res.setId(user.getId());
            res.setEmailId(user.getEmailId());
            res.setPassword(user.getPassword());
            res.setFirstName(user.getFirstName());
            res.setLastName(user.getLastName());
            res.setPassword(user.getPassword());
//            res.setTapID(user.getTapID());
//            res.setAddress(user.getAddress());
//            res.setInterest(user.getInterest());
//            res.setBankDetails(user.getBankDetails());
//            res.setContactDetails(user.getContactDetails());
//            res.setLocationDetails(user.getLocationDetails());
//            res.setContactNumber(user.getContactNumber());
//            res.setBusinessLocationDetails(user.getBusinessLocationDetails());
//            res.setRoleList(user.getRoleList());
//            res.setDocument(user.getDocument());
            // res.setToken(user.getToken());
        }
        return res;
    }

//
//    @Override
//    public User getUserByEmailId(String emailId){
//        
//        User user = null;
//        UserDTO uDto = null;
//        Query query = sessionFactory.getCurrentSession()
//                .createQuery("From User u where u.emailId=:emailID")
//                .setParameter("emailID", emailId);
//        
//             System.out.println("from DAO IMPL"+query);
//            logger.info("user Database data" + query);
//       for (Iterator itr = query.iterate(); itr.hasNext();){
//            uDto =  new UserDTO();
//             user =(User) itr.next();
//             System.out.println("from DAO IMPL"+user);
//             uDto.setFirstName(user.getFirstName());
//             uDto.setLastName(user.getLastName());
//             uDto.setEmail(user.getEmailId());
//             uDto.setPassword(user.getPassword());
//             uDto.setPhoneNumber(user.getPhoneNumber());
//             uDto.setAddress(user.getAddress());
//             uDto.setInterest(user.getInterest());
//             uDto.setRole(user.getRole());
//             
//            } 
//       return user;
//    }

    @Override
    public List<User> getUserList(Integer numberOfUsers) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.addOrder(Order.desc("id"));
        criteria.setMaxResults(numberOfUsers);
       return (List<User>) criteria.list();
    }

    
}
