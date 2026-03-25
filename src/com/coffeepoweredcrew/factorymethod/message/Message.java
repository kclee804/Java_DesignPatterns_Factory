package com.coffeepoweredcrew.factorymethod.message;

/**
 * This class represent interface for our "product" which is a message
 * Implementations will be specific to content type.  
 */
public abstract class Message {
	
	public abstract String getContent();
	
	public void addDefaultHeader() {
		//Add some default header 
	}
	
	public void encrypt() {
		//Add some code to encrypt the content
	}

}
