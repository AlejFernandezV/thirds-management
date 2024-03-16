package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence;

import java.util.ArrayList;
import java.util.Optional;

import com.thirdsmanagement.thirds.application.ports.output.ThirdOutputPort;
import com.thirdsmanagement.thirds.domain.model.Third;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdEntity;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.mapper.ThirdPersistenceMapper;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository.ThirdRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirdPersistenceAdapter implements ThirdOutputPort{

    private final ThirdRepository thirdRepository;

    private final ThirdPersistenceMapper thirdPersistenceMapper;

    @Override
    public Third saveThird(Third third) {
        
        System.out.println("Debug: Mapeando Third a ThirdEntity");
        ThirdEntity thirdEntity = thirdPersistenceMapper.toThirdEntity(third);
        System.out.println("Debug: ThirdEntity antes de guardar " + thirdEntity);
        thirdEntity.toString();

        thirdEntity = thirdRepository.save(thirdEntity);
        
        System.out.println("Debug: ThirdEntity después de guardar " + thirdEntity);
        thirdEntity.toString();
        Third result = thirdPersistenceMapper.toThird(thirdEntity);
        System.out.println("Debug: Third después de mapear de nuevo " + result);
        System.out.println(result.toString());


        return result;
    }

    @Override
    public Optional<Third> getThirdById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThirdById'");
    }

    @Override
    public Optional<Third> getThirdByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThirdByName'");
    }

    @Override
    public Optional<Third> getThirdByNIT(Long NIT) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getThirdByNIT'");
    }

    @Override
    public boolean changeThirdState(Third third) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeThirdState'");
    }

    @Override
    public ArrayList<Third> getAllThirdsBy(Long entId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllThirdsBy'");
    }
    
}
