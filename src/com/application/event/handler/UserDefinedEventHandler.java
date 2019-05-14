package com.application.event.handler;

import org.springframework.context.ApplicationListener;

public class UserDefinedEventHandler implements ApplicationListener<UserDefinedEvent> {

    @Override
    public void onApplicationEvent(UserDefinedEvent userDefinedEvent) {
        System.out.println(userDefinedEvent);
    }
}
