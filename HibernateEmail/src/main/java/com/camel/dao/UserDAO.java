package com.camel.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.camel.model.UserDetails;
import com.camel.model.Users;

public class UserDAO {

	
	public Users addUsers(Users users) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            transaction = session.beginTransaction();
            session.save(users);
            transaction.commit();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
	
	public UserDetails addUserDetails(UserDetails userDetails) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("Date Insert in UserDeatils");
            transaction = session.beginTransaction();
            session.save(userDetails);
            transaction.commit();
            return userDetails;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
	
	
	
}
