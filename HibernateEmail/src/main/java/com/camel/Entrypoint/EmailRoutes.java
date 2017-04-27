package com.camel.Entrypoint;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.commons.lang3.StringUtils;

public class EmailRoutes extends RouteBuilder{
	
	
	@Override
	public void configure() throws Exception {
	
		
		
		
		from("imaps://imap.gmail.com?username=44@gmail.com&password=270"
			    + "&delete=false&unseen=true&consumer.delay=6000")
		
		
		.process ( new Processor () {
			@SuppressWarnings("unchecked")
			public void process ( Exchange exchange ) throws Exception
			{
				
			
			
				
				String emailSubject = exchange.getIn ().getHeader ( "subject" ).toString();
				
				String bodyContent = exchange.getIn().getBody(String.class);
				String emailFrom = StringUtils.substringBetween(exchange.getIn ().getHeader ( "From" ).toString(), "<", ">");
				
				
				if(bodyContent.contains("Approved")){
					
					Util.AddUser(emailFrom, emailSubject, bodyContent);
					
				}else{
					Util.AddUserDetails(emailFrom, emailSubject, bodyContent);
					
				}
				
				
			}
		});

}
	
	
		
		
		
		
		
	
}