package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdsAndTypeEntity;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.identifiers.ThirdsAndTypeId;

public interface ThirdsAndTypeRepository extends JpaRepository<ThirdsAndTypeEntity,ThirdsAndTypeId>{
    
}
