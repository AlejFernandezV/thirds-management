package com.thirdsmanagement.thirds.domain.service;

import com.thirdsmanagement.thirds.application.ports.input.GetThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.output.ThirdOutputPort;
import com.thirdsmanagement.thirds.domain.exception.ThirdNotFound;
import com.thirdsmanagement.thirds.domain.model.Third;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetThirdService implements GetThirdUseCase{

    private final ThirdOutputPort thirdOutputPort;

    @Override
    public Third getThirdById(Long id) {
        return thirdOutputPort.getThirdById(id).orElseThrow(()-> new ThirdNotFound("Third not found with id " + id));
    }

    @Override
    public Third getThirdByName(String name) {
        return thirdOutputPort.getThirdByName(name).orElseThrow(()-> new ThirdNotFound("Third not found with name " + name));
    }

    @Override
    public Third getThirdByNIT(Long NIT) {
        return thirdOutputPort.getThirdByNIT(NIT).orElseThrow(() -> new ThirdNotFound("Third not found with NIT " + NIT));
    }
    
}
