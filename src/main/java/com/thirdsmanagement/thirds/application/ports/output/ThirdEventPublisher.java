package com.thirdsmanagement.thirds.application.ports.output;

import com.thirdsmanagement.thirds.domain.event.ThirdCreatedEvent;
import com.thirdsmanagement.thirds.domain.event.ThirdInactivatedEvent;
import com.thirdsmanagement.thirds.domain.event.ThirdObtainedEvent;
import com.thirdsmanagement.thirds.domain.event.ThirdsListedEvent;

public interface ThirdEventPublisher {
    
    void publishThirdCreatedEvent(ThirdCreatedEvent event);

    void publishThirdInactivatedEvent(ThirdInactivatedEvent event);

    void publishThirdObtainedEvent(ThirdObtainedEvent event);

    void publishThirdsListedEvent(ThirdsListedEvent event);
}
