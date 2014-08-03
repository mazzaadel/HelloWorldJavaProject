package com.inceptiontraining.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inceptiontraining.motd.MessageOfTheDayService;

public class ClientApplication 
{
    public static void main(String[] args) 
    {
        ApplicationContext factory = new 
                 ClassPathXmlApplicationContext("application.xml");
        
        MessageOfTheDayService helloWorld =  
            (MessageOfTheDayService)factory.getBean("motdService");
        
        helloWorld.sayHello();
    }
}
