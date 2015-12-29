package com.ndpar.spring.rabbitmq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
    	ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("/applicationContext.xml");
        
        MessageSender sender = context.getBean(MessageSender.class);
        sender.send("Hello,everyone!!!");
    }
}
