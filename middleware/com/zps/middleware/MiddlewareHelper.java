package com.zps.middleware;

import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.data.MediaType;


public class MiddlewareHelper {
	
	private String outputValue =  ""; 
	
	public  void setOutputValue(String output) {
		this.outputValue = output;
	}
	public  String getOutputValue() {
		return this.outputValue;
	}
	public MiddlewareHelper() {}
	
	   
		public  Restlet routeName1  = new Restlet() {
		    @Override
		    public  void handle(Request request, Response response) {
		    	
		      response.setEntity(getOutputValue(), MediaType.TEXT_PLAIN);
		 }};
	

}
