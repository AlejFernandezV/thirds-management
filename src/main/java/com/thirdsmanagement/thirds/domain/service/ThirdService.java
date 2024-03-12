package com.thirdsmanagement.thirds.domain.service;

import org.springframework.stereotype.Service;
import com.thirdsmanagement.thirds.domain.model.ThirdModel;
import com.thirdsmanagement.thirds.domain.repository.ThirdsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ThirdService {

    private final ThirdsRepository thirdRepo;

    public void createThird(ThirdModel thirdObject){
        thirdRepo.save(thirdObject);
    }
}
