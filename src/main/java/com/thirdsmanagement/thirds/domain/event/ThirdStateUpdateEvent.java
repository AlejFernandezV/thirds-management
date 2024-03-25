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
public class ThirdStateUpdateEvent {

    private Long thId;
    private Boolean thState;
    private LocalDateTime date;

    public ThirdStateUpdateEvent(Long thId, boolean thState){
        this.thId = thId;
        this.thState = thState;
        this.date = LocalDateTime.now();
    }
}
