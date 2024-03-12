package com.thirdsmanagement.thirds.infrastructure.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdsmanagement.thirds.domain.model.ThirdModel;
import com.thirdsmanagement.thirds.domain.service.ThirdService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/third")
public class ThirdController {

    private final ThirdService thirdService;
    
    @PostMapping
    public void createThird(@RequestBody ThirdModel third){
        thirdService.createThird(null);
    }
}
