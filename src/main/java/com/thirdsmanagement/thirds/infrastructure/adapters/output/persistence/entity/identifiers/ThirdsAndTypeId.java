package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.identifiers;

import java.io.Serializable;

import lombok.Data;

@Data
public class ThirdsAndTypeId implements Serializable{
    private Long thId;
    private Long entId;
    private Long ttId;
}
