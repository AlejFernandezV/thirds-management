package com.thirdsmanagement.thirds.domain.model.identifiers;

import java.io.Serializable;

import lombok.Data;

@Data
public class ThirdsAndTypeId implements Serializable{
    private Long thId;
    private Long entId;
    private Long ttId;
}
