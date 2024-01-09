package com.example;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public Calculadora (){
        System.out.println("entro a constructor de caluladora");
    }
    public String holaMundo(){
        return "hola mundo";
    }
}
