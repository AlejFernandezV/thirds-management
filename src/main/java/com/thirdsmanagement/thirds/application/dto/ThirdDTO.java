package com.thirdsmanagement.thirds.application.dto;


import lombok.Data;
import java.time.LocalDate;

@Data
public class ThirdDTO {

    private String thRutPath; 
    private ThirdType thType; 
    private String thPersonType;
    private String thGender; 
    private TypeID tipoIdentificacion;
    private String thIdNumber; 
    private String thVerificationNumber;
    private String thState; 
    private String thPhotoPath;
    private String thCountry; 
    private String thProvince; 
    private String thCity; 
    private String thAddress;
    private String thPhoneNumber; 
    private String thEmail;
    private LocalDate thCreationAt;
    private LocalDate thUpdatedAt;
}
