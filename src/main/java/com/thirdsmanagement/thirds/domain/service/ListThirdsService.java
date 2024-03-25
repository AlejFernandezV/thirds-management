package com.thirdsmanagement.thirds.domain.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.thirdsmanagement.thirds.application.ports.input.ListThirdsUseCase;
import com.thirdsmanagement.thirds.application.ports.output.ThirdOutputPort;
import com.thirdsmanagement.thirds.domain.exception.ThirdsNotFound;
import com.thirdsmanagement.thirds.domain.model.Third;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListThirdsService implements ListThirdsUseCase{

    private final ThirdOutputPort thirdOutputPort;

    @Override
    public Page<Third> getAllThirdsBy(Long entId, Pageable pageable) {

        Page<Third> result = thirdOutputPort.getAllThirdsBy(entId, pageable);

        if(result.isEmpty()){
            throw new ThirdsNotFound("No thirds found for enterprise id "+ entId);            
        }

        return result;
    }

    @Override
    public Page<Third> getAllThirdsFilterBy(String[] filters) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllThirdsFilterBy'");
    }
    
}
