package com.webmethods.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

@SuppressWarnings("serial")
public class Log4jInit extends HttpServlet {
	
	public Logger log = Logger.getLogger(Log4jInit.class);
	 
	
	 public void init()
	 {
	     String prefix =  getServletContext().getRealPath("/");
	     String file = getInitParameter("log4j-init-file");
	  
	     if(file != null){
	    	 PropertyConfigurator.configure(prefix+"\\"+file);
	    	 log.info(" ##=> Inicializado Log4J: " + prefix+"\\"+file);
	     }
	     else{
	    	 log.info("##=> Log4J - No es configurable en la aplicacion: " + prefix +"\\"+ file);
	     }    
	 }
	 
	 public void doGet(HttpServletRequest req, HttpServletResponse res) {}
}