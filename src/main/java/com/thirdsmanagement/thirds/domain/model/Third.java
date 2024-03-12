package com.thirdsmanagement.thirds.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;

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
public class Third {

    private Long thId; 
    private Long entId;

    private eTypeId typeId;
    private ArrayList<eThirdType> thirdTypes;

    private String rutPath; 
    private ePersonType tipoPersona; 
    private String nombres; 
    private String apellidos; 
    private String razonSocial; 
    private eThirdGender genero;
    private Long numeroIdentificacion;
    private Long digitoVerificacion; 
    private String estado;
    private String fotoPath;
    private String pais;
    private String provincia;
    private String ciudad; 
    private String direccion;
    private String telefono; 
    private String email; 

    private LocalDate fechaCreacion;
    private LocalDate fechaActualizacion;
}