package com.application.event.handler;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class UserDefinedEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(org.springframework.context.ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
    public void publish(){
        UserDefinedEvent userDefinedEvent = new UserDefinedEvent(applicationEventPublisher);
        applicationEventPublisher.publishEvent(userDefinedEvent);
    }
}
