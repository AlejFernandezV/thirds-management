package com.thirdsmanagement.thirds.domain.exception;

public class ThirdDontInactivate extends RuntimeException{
    
    public ThirdDontInactivate(String message){
        super(message);
    }
}
