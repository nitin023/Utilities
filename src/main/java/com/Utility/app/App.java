package com.Utility.app;

import com.Utility.app.email.Email;
import com.Utility.app.email.EmailImpl;
import com.Utility.app.email.Constant.EmailTemplate;

public class App 
{
    public static void main( String[] args )
    {    	
    	Email emailInfo = new Email("Twitter account verification","ashish.sharma7345@gmail.com",EmailTemplate.APP_VERIFY);    	
    	EmailImpl emailImpl = new EmailImpl();
    	emailImpl.sendEmail(emailInfo);
    }
   
}
