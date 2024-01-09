package com.example;

import org.springframework.stereotype.Component;

@Component
public class GestorFactura {
    public Calculadora calculadora;

    public GestorFactura(Calculadora calculadora){
        System.out.println("ento a constructor gestor factura");
        this.calculadora = calculadora;
    }
}
