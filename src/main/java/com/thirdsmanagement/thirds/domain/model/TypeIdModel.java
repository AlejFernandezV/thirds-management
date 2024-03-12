package com.thirdsmanagement.thirds.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TYPE_ID")
public class TypeIdModel {
    @Id
    @Column(name = "TI_ID")
    private Long tiId;

    @Column(name = "TI_NAME")
    private String tiName;
}
