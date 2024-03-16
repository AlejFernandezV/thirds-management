package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.thirdsmanagement.thirds.domain.model.Third;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request.ThirdCreateRequest;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.response.ThirdResponse;

@Mapper
public interface ThirdRestMapper {
    
    Third toThird(ThirdCreateRequest thirdCreateRequest);
    
    @Mapping(source = "idNumber",target = "id")
    @Mapping(source = "names",target = "name")
    @Mapping(source = "state",target = "description")
    ThirdResponse toThirdCreateResponse(Third third);

    //ThirdResponse toThirdChangeStateResponse(Third third);

    //ThirdResponse toThirdListResponse(ArrayList<Third> list);

    //ThirdResponse toThirdQueryResponse(Third third);
}
