package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest;

import org.springframework.web.bind.annotation.RestController;

import com.thirdsmanagement.thirds.application.ports.input.CreateThirdUseCase;
//import com.thirdsmanagement.thirds.application.ports.input.GetThirdUseCase;
//import com.thirdsmanagement.thirds.application.ports.input.InactivateThirdUseCase;
import com.thirdsmanagement.thirds.domain.model.Third;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request.ThirdCreateRequest;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.response.ThirdResponse;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.mapper.ThirdRestMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/th_api")
@RequiredArgsConstructor

public class ThirdRestAdapter {

    private final CreateThirdUseCase createThirdUseCase;
    //private final GetThirdUseCase getThirdUseCase;
    //private final InactivateThirdUseCase inactivateThirdUseCase;

    private final ThirdRestMapper thirdRestMapper;

    @PostMapping("/thirds")
    public ResponseEntity<ThirdResponse> createThird(@RequestBody @Valid ThirdCreateRequest thirdCreateRequest) {

        System.out.println("\n");
        System.out.println("Entrando a petición post crear");
        System.out.println("\n");

        Third third = thirdRestMapper.toThird(thirdCreateRequest);

        System.out.println(third.getNames());

        third = createThirdUseCase.createThird(third);

        return new ResponseEntity<>(thirdRestMapper.toThirdCreateResponse(third), HttpStatus.CREATED);
    }
}
