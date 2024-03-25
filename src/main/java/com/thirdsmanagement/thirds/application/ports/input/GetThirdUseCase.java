package com.thirdsmanagement.thirds.application.ports.input;

import com.thirdsmanagement.thirds.domain.model.Third;

public interface GetThirdUseCase {
    Third getThirdById(Long id);
    Third getThirdByName(String name);
    Third getThirdByNIT(Long NIT);
}
