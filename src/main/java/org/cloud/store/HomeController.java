package org.cloud.store;

/**
 * @Deepak
 */
import java.io.IOException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(Locale locale, Model model) {
		return "welcome";
	}
	
	@RequestMapping(value = "/contactus", method = RequestMethod.GET)
	public String contactus(Locale locale, Model model) {
		return "contactus";
	}
	
	@RequestMapping(value = "/contactForm", method = RequestMethod.POST)
	public String contactForm(HttpServletRequest req, Locale locale) {
		SendSMS sms =new SendSMS();
		sms.sendEmail(req.getParameter("user"), req.getParameter("email"), "");
		sms.sendSMS( req.getParameter("Phone"),"Thank You for getting in touch with us. We will get back to you ASAP");
		return "contactus";
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Locale locale, Model model) {
		return "about";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/appProperties",method = RequestMethod.POST)
	public String appProperties(HttpServletRequest req, Model model) throws Exception{
		//Map<String,String> hash=new HashMap<String,String>();
		
		try {
			
			 DB db = GetMongoConnections.getConnection();
			 DBCollection collection = db.getCollection("Rasberry");
			 BasicDBObject doc = new BasicDBObject();
			 int count = (int) collection.count();
			 if(count==0){
				 doc.put("username",(String) req.getParameter("inputUserName"));
	     		
	     		 doc.put("inputAccessToken",(String) req.getParameter("inputAccessToken"));
	     		 doc.put("deleteCheck",(String) req.getParameter("deleteCheck"));
				 collection.insert(doc);
			 }
			 if(count==1){
				 DBObject user = collection.findOne();
				 DBObject userUpdate = collection.findOne();
				 if(userUpdate!=null){
					 userUpdate.put("username",(String) req.getParameter("inputUserName"));
					 userUpdate.put("inputAccessToken",(String) req.getParameter("inputAccessToken"));
					 userUpdate.put("deleteCheck",(((String) req.getParameter("deleteCheck"))==null)?true:false);
					 collection.update(user,userUpdate);
				 }
			 }
		}

		catch(IOException ioe){

		}
		return "welcome";
	}
	
}
		
	
