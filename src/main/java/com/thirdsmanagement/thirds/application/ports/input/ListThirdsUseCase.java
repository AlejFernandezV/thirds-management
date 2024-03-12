package com.thirdsmanagement.thirds.application.ports.input;

import java.util.ArrayList;

import com.thirdsmanagement.thirds.domain.model.Third;

public interface ListThirdsUseCase {
    ArrayList<Third> getAllThirdsBy(Long entId);
    ArrayList<Third> getAllThirdsFilterBy(String[] filters);
}
