package com.application.main;

import com.application.event.handler.UserDefinedEventPublisher;
import com.application.model.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserDefinedEventPublisher userDefinedEventPublisher =(UserDefinedEventPublisher) context.getBean("userDefinedEventPublisher");
        Message message = context.getBean("message",Message.class);
        System.out.println(message.getMessageId()+"\t"+message.getMessageName());
        userDefinedEventPublisher.publish();
        ((AbstractApplicationContext) context).close();
    }
}
