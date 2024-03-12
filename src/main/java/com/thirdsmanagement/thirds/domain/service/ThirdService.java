package com.thirdsmanagement.thirds.domain.service;

import java.util.ArrayList;

import com.thirdsmanagement.thirds.application.ports.input.CreateThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.input.GetThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.input.InactivateThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.input.ListThirdsUseCase;
import com.thirdsmanagement.thirds.application.ports.output.ThirdEventPublisher;
import com.thirdsmanagement.thirds.application.ports.output.ThirdOutputPort;
import com.thirdsmanagement.thirds.domain.model.Third;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThirdService implements CreateThirdUseCase, GetThirdUseCase, InactivateThirdUseCase, ListThirdsUseCase{

    private final ThirdOutputPort thirdOutputPort;
    private final ThirdEventPublisher thirdEventPublisher;
    
    @Override
    public ArrayList<Third> getAllThirdsBy(Long entId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllThirdsBy'");
    }
    @Override
    public ArrayList<Third> getAllThirdsFilterBy(String[] filters) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllThirdsFilterBy'");
    }
    @Override
    public boolean changeThirdState(Third third) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeThirdState'");
    }
    @Override
    public Third getThirdById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThirdById'");
    }
    @Override
    public Third getThirdByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThirdByName'");
    }
    @Override
    public Third getThirdByNIT(Long NIT) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThirdByNIT'");
    }
    @Override
    public Third createThird(Third third) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createThird'");
    }

    
}
