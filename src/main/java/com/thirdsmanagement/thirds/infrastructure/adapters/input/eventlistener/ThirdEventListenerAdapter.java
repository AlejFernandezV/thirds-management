package com.thirdsmanagement.thirds.infrastructure.adapters.input.eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.thirdsmanagement.thirds.domain.event.ThirdCreatedEvent;
import com.thirdsmanagement.thirds.domain.event.ThirdInactivatedEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ThirdEventListenerAdapter {
    
    @EventListener
    public void handleCreate(ThirdCreatedEvent event){
        log.info(null);
    }

    @EventListener
    public void handleInactivate(ThirdInactivatedEvent event){
        //TODO
        log.info(null);
    }
}
