package com.inceptiontraining.motd;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MessageOfTheDayDailyDynamicImplementation implements
		MessageOfTheDayService 
{
	private String[] messages = new String[]
		            {
						"Sunday morning, its just a restless feeling by my side",
						"Just another manic Monday",
						"Forget Java, it's Ruby Tuesday",
						"No more Waiting for Wednesday",
						"Oh Thursday, Thursday, how could you leave and not take me",
						"I've got Friday on my mind",
						"Saturday Night Is the Loneliest Night of the Week"
					};
	
	public void sayHello() 
	{
		// What day is it?
		int day = new GregorianCalendar().get(Calendar.DAY_OF_WEEK);
		
		// days are 1 based in Java!
		String message = messages[day-1];
		
		System.out.println(message);
	}
}
