package com.thirdsmanagement.thirds.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thirdsmanagement.thirds.domain.model.ThirdModel;
import com.thirdsmanagement.thirds.domain.model.identifiers.ThirdAndEnterpriseId;

@Repository
public interface ThirdsRepository extends JpaRepository <ThirdModel, ThirdAndEnterpriseId>{
    
}
