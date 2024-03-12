package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TYPE_ID")
public class TypeIdEntity {
    @Id
    @Column(name = "TI_ID")
    private Long tiId;

    @Column(name = "TI_NAME")
    private String tiName;
}
