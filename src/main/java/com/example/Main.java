package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //CREACION OBJETO FORMA NORMAL
            // Calculadora calIntanciaNormal = new Calculadora();
         //CREACION DE OBJETO COMO LO HACE SPRING POR DEFECTO USANDO SINGLETON (QUE USA EL MISMO OBJETO Y NO CREA UNO NUEVO)
            ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
            Calculadora  calculadora = (Calculadora) context.getBean("calculadora");
            String texto = calculadora.holaMundo();
            System.out.println(texto);

            String texto2 = calculadora.holaMundo();
            System.out.println(texto);

        //CARGANDO UN BEAN DENTRO DE OTO BEAN
            GestorFactura gestorFactura = (GestorFactura) context.getBean("gestorFactura");
            System.out.println(gestorFactura.calculadora.holaMundo());
    }
}