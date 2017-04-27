package com.camel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "amc_userdetails")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetails {

		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		private int userdetailsid;
		  private String username;
		    private String useremilid;
		    private String emailsubject;
		    @Temporal(value = TemporalType.TIMESTAMP)
		    private Date creteddate;
		    @Lob
		    private String  body;
			
		    public int getUserdetailsid() {
				return userdetailsid;
			}
			public void setUserdetailsid(int userdetailsid) {
				this.userdetailsid = userdetailsid;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getUseremilid() {
				return useremilid;
			}
			public void setUseremilid(String useremilid) {
				this.useremilid = useremilid;
			}
			public String getEmailsubject() {
				return emailsubject;
			}
			public void setEmailsubject(String emailsubject) {
				this.emailsubject = emailsubject;
			}
			public Date getCreteddate() {
				return creteddate;
			}
			public void setCreteddate(Date creteddate) {
				this.creteddate = creteddate;
			}
			   
			public String getBody() {
				return body;
			}
			public void setBody(String body) {
				this.body = body;
			}

		}
