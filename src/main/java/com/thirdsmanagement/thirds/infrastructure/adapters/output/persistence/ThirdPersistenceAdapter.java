package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.thirdsmanagement.thirds.application.ports.output.ThirdOutputPort;
import com.thirdsmanagement.thirds.domain.model.Third;
import com.thirdsmanagement.thirds.domain.model.eThirdType;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdEntity;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdTypeEntity;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdsAndTypeEntity;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.TypeIdEntity;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.mapper.ThirdPersistenceMapper;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository.ThirdRepository;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository.ThirdTypeRepository;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository.ThirdsAndTypeRepository;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.repository.TypeIdRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ThirdPersistenceAdapter implements ThirdOutputPort{

    @PersistenceContext
    private EntityManager entityManager;

    private final ThirdRepository thirdRepository;
    private final ThirdTypeRepository thirdTypeRepository;
    private final TypeIdRepository typeIdRepository;
    private final ThirdsAndTypeRepository thirdsAndTypeRepository;

    private final ThirdPersistenceMapper thirdPersistenceMapper;

    @Override
    public Third saveThird(Third third) {

        System.out.println(third.getTypeId());
        System.out.println(third.getTypeId().name());


        ThirdEntity thirdEntity = thirdPersistenceMapper.toThirdEntity(third);

        TypeIdEntity typeIdEntity = typeIdRepository.getReferenceById(third.getTypeId().name());

        Map<String, ThirdTypeEntity> thirdTypeEntityMap = thirdTypeRepository.findAll()
        .stream()
        .collect(Collectors.toMap(ThirdTypeEntity::getTtName, ttEntity -> ttEntity));

        if(typeIdEntity != null){
            thirdEntity = thirdRepository.save(thirdEntity);
        }

        if (third.getThirdTypes() != null) {
            for (eThirdType tipo : third.getThirdTypes()) {
                ThirdTypeEntity ttEntity = thirdTypeEntityMap.get(tipo.name());
                if (ttEntity != null) {
                    ThirdsAndTypeEntity thirdsAndTypeEntity = new ThirdsAndTypeEntity();

                    Query query = entityManager.createQuery("SELECT t FROM ThirdEntity t ORDER BY t.thId DESC", ThirdEntity.class);
                    query.setMaxResults(1);
                    ThirdEntity ultimaTupla = (ThirdEntity) query.getSingleResult();

                    thirdsAndTypeEntity.setThId(ultimaTupla.getThId());
                    thirdsAndTypeEntity.setTtId(ttEntity.getTtId());
                    thirdsAndTypeEntity.setThird(thirdEntity);
                    thirdsAndTypeEntity.setThirdType(ttEntity);
                    thirdsAndTypeRepository.save(thirdsAndTypeEntity);
                }
            }
        }

        Third result = thirdPersistenceMapper.toThird(thirdEntity);

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
    public Page<Third> getAllThirdsBy(Long entId, Pageable page) {
        System.out.println("\n Entrando a getAllThirdsBy \n");
        Page<ThirdEntity> pageEntities = thirdRepository.getThirdsBy(entId, page);
        Page<Third> pageThirds = pageEntities.map(this::convertToThird);

        for(Third obj : pageThirds.getContent()){
            System.out.println(obj.toString());
        }

        return pageThirds;
    }

    private Third convertToThird(ThirdEntity thirdEntity) {

        System.out.println("\n Entrando a convertToThird \n");

        Third obj = this.thirdPersistenceMapper.toThird(thirdEntity);

        System.out.println(obj.toString());

        TypedQuery<ThirdTypeEntity> query = entityManager.createQuery("SELECT tt FROM ThirdsAndTypeEntity tat INNER JOIN tat.thirdType tt where tat.thId = :thId", ThirdTypeEntity.class);
        query.setParameter("thId", obj.getThId());
        /*
        List<ThirdTypeEntity> results = query.getResultList();

        
        for(ThirdTypeEntity tt: results){
            System.out.println(tt.toString());
            try {
                eThirdType thirdType = eThirdType.valueOf(tt.getTtName());
                obj.getThirdTypes().add(thirdType);
            } catch (IllegalArgumentException e) {
                System.err.println("Error converting to eThirdType: " + tt.getTtName());
            }
        }
         */
        return obj;
    }
}
