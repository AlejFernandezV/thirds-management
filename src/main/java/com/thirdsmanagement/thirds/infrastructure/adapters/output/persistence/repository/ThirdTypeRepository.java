package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdTypeEntity;

public interface ThirdTypeRepository extends JpaRepository<ThirdTypeEntity,Long>{
    
}
