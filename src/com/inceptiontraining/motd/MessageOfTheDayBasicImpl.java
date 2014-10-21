package com.inceptiontraining.motd;

/**
 * A very basic implementation of a message of the day service
 * @author Richard Chesterwood
 */
public class MessageOfTheDayBasicImpl implements MessageOfTheDayService 
{
	private String message;
	
	public MessageOfTheDayBasicImpl()
	{
	}
	
	public void setMessage(String newMessage)
	{
		this.message = newMessage;
	}
	
	@Override
	public void sayHello() 
	{
		System.out.println(this.message);
	}
}
