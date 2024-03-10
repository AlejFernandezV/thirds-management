package com.thirdsmanagement.thirds.domain.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class ThirdModel {
    private Long thId; // TH_ID
    private Long entId; // ENT_ID
    private Long tiID; // TI_ID
    private String rutPath; // TH_RUT_PATH
    private String tipoPersona; // TH_PERSON_TYPE
    private String nombres; // TH_NAMES
    private String apellidos; // TH_LAST_NAMES
    private String razonSocial; // TH_SOCIAL_REASON
    private String genero; // TH_GENDER
    private Long numeroIdentificacion; // TH_ID_NUMBER
    private Long digitoVerificacion; // TH_VERIFICATION_NUMBER
    private String estado; // TH_STATE
    private String fotoPath; // TH_PHOTO_PATH
    private String pais; // TH_COUNTRY
    private String provincia; // TH_PROVINCE
    private String ciudad; // TH_CITY
    private String direccion; // TH_ADDRESS
    private String telefono; // TH_PHONE_NUMBER
    private String email; // TH_EMAIL
    private LocalDate fechaCreacion; // TH_CREATION_AT
    private LocalDate fechaActualizacion; // TH_UPDATED_AT
}
