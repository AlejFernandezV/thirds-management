package com.thirdsmanagement.thirds.domain.event;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThirdInactivatedEvent {
    private Long thId;
    private boolean thState;
    private LocalDateTime date;

    public ThirdInactivatedEvent(Long thId, boolean thState){
        this.thId = thId;
        this.thState = thState;
        this.date = LocalDateTime.now();
    }
}
