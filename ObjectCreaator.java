package com.provider;

import java.io.FileInputStream;
import java.util.Properties;
import com.services.UserServices;


public class ObjectCreaator {

	public static UserServices createObject() {
		UserServices obj = null;
		try{
			
			FileInputStream f = new FileInputStream(".//resources//info.properties");
			Properties p = new Properties();
			p.load(f);
			String classname = p.getProperty("bussinesslogicclass");
			obj = (UserServices)Class.forName(classname).newInstance();
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		return obj;
		
	}

}
