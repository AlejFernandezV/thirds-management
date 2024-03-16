package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

public class GetThirdsRequest {
    
    @NotEmpty(message = "Enterprise ID not be empty") 
    private Long entId;
}
