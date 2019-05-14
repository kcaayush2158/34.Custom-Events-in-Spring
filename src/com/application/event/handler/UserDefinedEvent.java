package com.application.event.handler;

import org.springframework.context.ApplicationEvent;

public class UserDefinedEvent extends ApplicationEvent {
    private static final long serialVersionUID = 7099057708183571937L;

    public UserDefinedEvent(Object source){
        super(source);

    }

    @Override
    public String toString() {
        return "Hello world";
    }
}
