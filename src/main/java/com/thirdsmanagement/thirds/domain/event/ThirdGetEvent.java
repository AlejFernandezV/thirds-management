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
public class ThirdGetEvent {
    private Long thId;
    private LocalDateTime date;

    public ThirdGetEvent(Long thId){
        this.thId = thId;
        this.date = LocalDateTime.now();
    }
}
