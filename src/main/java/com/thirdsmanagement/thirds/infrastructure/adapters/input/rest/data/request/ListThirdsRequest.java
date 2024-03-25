package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class ListThirdsRequest {
    
    @NotNull(message = "Enterprise ID not be empty") 
    private Long entId;

    @NotNull(message = "Number page not be empty")
    private int numPage;
}
