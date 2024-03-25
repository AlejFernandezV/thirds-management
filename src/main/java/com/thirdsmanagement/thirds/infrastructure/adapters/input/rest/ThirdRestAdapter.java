package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest;

import org.springframework.web.bind.annotation.RestController;

import com.thirdsmanagement.thirds.application.ports.input.CreateThirdUseCase;
//import com.thirdsmanagement.thirds.application.ports.input.GetThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.input.ListThirdsUseCase;
//import com.thirdsmanagement.thirds.application.ports.input.GetThirdUseCase;
//import com.thirdsmanagement.thirds.application.ports.input.InactivateThirdUseCase;
import com.thirdsmanagement.thirds.domain.model.Third;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request.ListThirdsRequest;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.request.ThirdCreateRequest;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.response.ThirdResponse;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.data.response.ThirdsEnterpriseListResponse;
import com.thirdsmanagement.thirds.infrastructure.adapters.input.rest.mapper.ThirdRestMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/th_api")
@RequiredArgsConstructor

public class ThirdRestAdapter {

    private final CreateThirdUseCase createThirdUseCase;
    private final ListThirdsUseCase listThirdsUseCase;
    //private final GetThirdUseCase getThirdUseCase;
    //private final InactivateThirdUseCase inactivateThirdUseCase;

    private final ThirdRestMapper thirdRestMapper;

    @PostMapping("/thirds")
    public ResponseEntity<ThirdResponse> createThird(@RequestBody @Valid ThirdCreateRequest thirdCreateRequest) {

        System.out.println("\n");
        System.out.println("Entrando a petición post crear");
        System.out.println("\n");

        Third third = thirdRestMapper.toThird(thirdCreateRequest);

        third = createThirdUseCase.createThird(third);

        return new ResponseEntity<>(thirdRestMapper.toThirdCreateResponse(third), HttpStatus.CREATED);
    }

    @GetMapping("/thirds")
    public ResponseEntity<Page<Third>> getThirdsList(@RequestBody @Valid ListThirdsRequest listThirdsRequest) {
        System.out.println("\n");
        System.out.println("Entrando a petición get thirds");
        System.out.println("\n");

        Long entId = listThirdsRequest.getEntId();
        int numPage = listThirdsRequest.getNumPage();

        Pageable pageable = PageRequest.of(numPage, 10);

        Page<Third> page = listThirdsUseCase.getAllThirdsBy(entId,pageable);

        return new ResponseEntity<>(page, HttpStatus.FOUND);

    }
    
}
