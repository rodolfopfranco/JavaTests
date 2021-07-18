package com.teste;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraNovaTest {
    @Test
    public void deveSomarDoisValores(){
        int a=1;
        int b=2;
        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(a,b);
        assertEquals(3,soma);
    }

}