package com.camel.Entrypoint;

import java.sql.Timestamp;
import java.util.Date;

import com.camel.model.UserDetails;
import com.camel.model.Users;

public class Util {
	
	
	public static Date CurrentDate(){
	
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	    return timestamp;
	}
	
	public static String username(String form){
		String[] username = form.split("@");
		return username[0];
	}
	
	
	
	public static void AddUser(String form,String subject,String body){

		com.camel.dao.UserDAO userDAO = new com.camel.dao.UserDAO();
		Users users = new Users();
		if(body.length() >999){
			body = body.substring(0, 999);
		}
		users.setBody(body);
		users.setEmailsubject(subject);
		users.setUseremilid(form);
		users.setUsername(username(form));
		users.setCreteddate(Util.CurrentDate());
		userDAO.addUsers(users);
		
	}
	public static void AddUserDetails(String form,String subject,String body){

		com.camel.dao.UserDAO userDAO = new com.camel.dao.UserDAO();
		UserDetails userDetails = new UserDetails();
		if(body.length() >999){
			body = body.substring(0, 999);
		}
		userDetails.setBody(body);
		userDetails.setEmailsubject(subject);
		userDetails.setUsername(username(form));
		userDetails.setUseremilid(form);
		userDetails.setCreteddate(Util.CurrentDate());
		userDAO.addUserDetails(userDetails);
		
	}
	
	

}
