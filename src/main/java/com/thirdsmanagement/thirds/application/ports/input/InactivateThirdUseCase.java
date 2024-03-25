package com.thirdsmanagement.thirds.application.ports.input;

import com.thirdsmanagement.thirds.domain.model.Third;

public interface InactivateThirdUseCase {
    boolean changeThirdState(Third third);
}
