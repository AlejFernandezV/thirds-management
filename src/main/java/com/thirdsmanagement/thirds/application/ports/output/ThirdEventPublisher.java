package com.thirdsmanagement.thirds.application.ports.output;

import com.thirdsmanagement.thirds.domain.event.ThirdCreatedEvent;
import com.thirdsmanagement.thirds.domain.event.ThirdStateUpdateEvent;

public interface ThirdEventPublisher {
    
    void publishThirdCreatedEvent(ThirdCreatedEvent event);

    void publishThirdStateUpdateEvent(ThirdStateUpdateEvent event);
}
