package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request;

import java.time.LocalDate;
import java.util.Set;

import com.thirdsmanagement.thirds.domain.model.ePersonType;
import com.thirdsmanagement.thirds.domain.model.eThirdGender;
import com.thirdsmanagement.thirds.domain.model.eThirdType;
import com.thirdsmanagement.thirds.domain.model.eTypeId;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class ThirdCreateRequest {
    
    private Long thId;

    @NotNull(message = "Enterprise ID not be empty") 
    private Long entId;

    @NotNull(message = "The id type not be empty") 
    @Enumerated(EnumType.STRING)
    private eTypeId typeId;

    
    @NotNull(message = "The person type not be empty")  
    private ePersonType personType; 
    
    @NotNull(message = "The third type cannot be empty") 
    private Set<eThirdType> thirdTypes;

    private String rutPath;
    private String names; 
    private String lastNames; 
    private String socialReason; 
    private eThirdGender gender;
    private Long idNumber;
    private Long verificationNumber; 
    private Boolean state;
    private String photoPath;
    private String country;
    private String province;
    private String city; 
    private String address;
    private String phoneNumber; 
    private String email; 

    private LocalDate creationDate;
    private LocalDate updateDate;
}
