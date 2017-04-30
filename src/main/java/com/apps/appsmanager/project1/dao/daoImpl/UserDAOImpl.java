/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.appsmanager.project1.dao.daoImpl;

import com.apps.appsmanager.project1.model.User;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
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
    public List<User> getUserList(Integer numberOfUsers) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.addOrder(Order.desc("id"));
        criteria.setMaxResults(numberOfUsers);
       return (List<User>) criteria.list();
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
