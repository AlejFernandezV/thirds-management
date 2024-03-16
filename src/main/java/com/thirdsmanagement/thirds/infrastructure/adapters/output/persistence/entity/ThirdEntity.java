package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity;

import java.time.LocalDate;

import com.thirdsmanagement.thirds.domain.model.ePersonType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "THIRDS")
public class ThirdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, name = "th_id")
    private Long thId; 

    @Column(name = "ent_id")
    private Long entId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ti_id", referencedColumnName = "ti_id")
    @Enumerated(EnumType.STRING)
    private TypeIdEntity typeId;

    @Column(name = "th_ruth_path")
    private String rutPath; 

    @Column(name = "th_person_type")
    private ePersonType personType; 

    @Column(name = "th_names")
    private String names; 

    @Column(name = "th_last_names")
    private String lastNames; 
    
    @Column(name = "th_social_reason")
    private String socialReason; 

    @Column(name = "th_gender")
    private String gender;

    @Column(name = "th_id_number")
    private Long idNumber;

    @Column(name = "th_verification_number")
    private Long verificationNumber; 

    @Column(name = "th_state")
    private String state;

    @Column(name = "th_photo_path")
    private String photoPath;

    @Column(name = "th_country")
    private String country;

    @Column(name = "th_province")
    private String province;

    @Column(name = "th_city")
    private String city; 

    @Column(name = "th_address")
    private String address;

    @Column(name = "th_phone_number")
    private String phoneNumber; 

    @Column(name = "th_email")
    private String email; 

    @Column(name = "th_created_at")
    private LocalDate creationDate;

    @Column(name = "th_updated_at")
    private LocalDate updateDate;

    @Override
    public String toString() {
        return "ThirdEntity{" +
                "thId=" + thId +
                ", entId=" + entId +
                ", rutPath='" + rutPath + '\''+"}";
    }
}
