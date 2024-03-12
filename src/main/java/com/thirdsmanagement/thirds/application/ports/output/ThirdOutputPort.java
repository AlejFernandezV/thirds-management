package com.thirdsmanagement.thirds.application.ports.output;

import java.util.ArrayList;
import java.util.Optional;

import com.thirdsmanagement.thirds.domain.model.Third;

public interface ThirdOutputPort {
    Third saveThird(Third third);

    Optional<Third> getThirdById(Long id);
    Optional<Third> getThirdByName(String name);
    Optional<Third> getThirdByNIT(Long NIT);

    boolean changeThirdState(Third third);

    ArrayList<Third> getAllThirdsBy(Long entId);
}
