package com.thirdsmanagement.thirds.domain.service;

import java.util.ArrayList;

import com.thirdsmanagement.thirds.application.ports.input.ListThirdsUseCase;
import com.thirdsmanagement.thirds.application.ports.output.ThirdOutputPort;
import com.thirdsmanagement.thirds.domain.exception.ThirdsNotFound;
import com.thirdsmanagement.thirds.domain.model.Third;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ListThirdsService implements ListThirdsUseCase{

    private final ThirdOutputPort thirdOutputPort;

    @Override
    public ArrayList<Third> getAllThirdsBy(Long entId) {
        ArrayList<Third> list = new ArrayList<>();
        list = thirdOutputPort.getAllThirdsBy(entId);
        if(list.isEmpty()){
            throw new ThirdsNotFound("No thirds found for enterprise id " + entId);
        }
        return list;
    }

    @Override
    public ArrayList<Third> getAllThirdsFilterBy(String[] filters) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllThirdsFilterBy'");
    }
    
}
