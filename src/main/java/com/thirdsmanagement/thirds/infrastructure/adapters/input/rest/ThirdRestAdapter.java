package com.thirdsmanagement.thirds.infrastructure.adapters.input.rest;

import org.springframework.web.bind.annotation.RestController;

import com.thirdsmanagement.thirds.application.ports.input.CreateThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.input.GetThirdUseCase;
import com.thirdsmanagement.thirds.application.ports.input.InactivateThirdUseCase;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor

public class ThirdRestAdapter {
    private final CreateThirdUseCase createThirdUseCase;
    private final GetThirdUseCase getThirdUseCase;
    private final InactivateThirdUseCase inactivateThirdUseCase;

    //public ResponseEntity<>

}
