package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ThirdResponse {

    private Long id;

    private String name;

    private String description;
    
}
