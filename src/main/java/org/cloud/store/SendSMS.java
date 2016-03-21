package org.cloud.store;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.mail.MailMessage;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;


/**
 * 
 * @author Arpit
 *
 */
public class SendSMS {
	static TwilioRestClient client ;
    /* Twilio REST API version */
    public static final String ACCOUNTSID = "xxxx";
    public static final String AUTHTOKEN = "xxxx";
    
    public void sendEmail(String UserName, String emailId,String alertmessage){
		System.out.println("Sending email to "+emailId);
		final String sender = "cloudrasberry@gmail.com";
		final String password = "xxxx";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(sender, password);
			}
		  });
 
		try {
 
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("cloudrasberry@gmail.com"));
			message.setRecipients(javax.mail.Message.RecipientType.TO,
				InternetAddress.parse(emailId));
			message.setSubject("Thank You Note from CloudRasberry ");
			alertmessage="Thank You for getting in touch with us. We will get back to you ASAP";
			message.setText(alertmessage);
 
			Transport.send(message);
 
			//System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	}
    
    public void sendSMS(String userNumber,String smsMessage){
    	
    	client=new TwilioRestClient(ACCOUNTSID, AUTHTOKEN);
    	
   	 
        // Build a filter for the MessageList
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("Body", smsMessage));
        params.add(new BasicNameValuePair("To", userNumber));
        params.add(new BasicNameValuePair("From", "+12345678"));
     
        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        try {
			Message message = messageFactory.create(params);
		} catch (TwilioRestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
