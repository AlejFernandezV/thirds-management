package com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.thirdsmanagement.thirds.domain.model.Third;
import com.thirdsmanagement.thirds.infrastructure.adapters.output.persistence.entity.ThirdEntity;

@Mapper(componentModel = "spring")
public interface ThirdPersistenceMapper {

    @Mapping(source = "typeId", target = "typeId.tiId")
    ThirdEntity toThirdEntity(Third third);

    @Mapping(source = "typeId.tiId", target = "typeId")
    Third toThird(ThirdEntity thirdEntity);
}