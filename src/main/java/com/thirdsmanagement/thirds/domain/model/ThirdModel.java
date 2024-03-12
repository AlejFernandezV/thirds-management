package com.thirdsmanagement.thirds.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import com.thirdsmanagement.thirds.domain.model.identifiers.ThirdAndEnterpriseId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "THIRDS")
@IdClass(ThirdAndEnterpriseId.class)
public class ThirdModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "th_id")
    private Long thId; 

    @Id
    @Column(unique = true, nullable = false, name = "ent_id")
    private Long entId;

    //Relationships
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ti_id", referencedColumnName = "ti_id")
    private TypeIdModel typeId;

    /////////////////////////////////////////////////////////////////

    @Column(name = "th_ruth_path")
    private String rutPath; 

    @Column(name = "th_person_type")
    private String tipoPersona; 

    @Column(name = "th_names")
    private String nombres; 

    @Column(name = "th_last_names")
    private String apellidos; 
    
    @Column(name = "th_social_reason")
    private String razonSocial; 

    @Column(name = "th_gender")
    private String genero;

    @Column(name = "th_id_number")
    private Long numeroIdentificacion;

    @Column(name = "th_verification_number")
    private Long digitoVerificacion; 

    @Column(name = "th_state")
    private String estado;

    @Column(name = "th_photo_path")
    private String fotoPath;

    @Column(name = "th_country")
    private String pais;

    @Column(name = "th_province")
    private String provincia;

    @Column(name = "th_city")
    private String ciudad; 

    @Column(name = "th_address")
    private String direccion;

    @Column(name = "th_phone_number")
    private String telefono; 

    @Column(name = "th_email")
    private String email; 

    @Column(name = "th_created_at")
    private LocalDate fechaCreacion;

    @Column(name = "th_updated_at")
    private LocalDate fechaActualizacion;
}
