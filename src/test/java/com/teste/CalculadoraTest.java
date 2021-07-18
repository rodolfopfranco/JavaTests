package com.teste;
//Junit é um framework de testes unitários para oganização e teste.
//Testa as funções uma a uma.
//O ideal é que cada classe tenha seu equivalente na src/test

//Deixar o cursor em cima do nome da classe em src/main e usar Alt+Enter>>Create Test
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {
    @Test
    public void somar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5,soma);
    }

    @Test
    public void testeSomarComMock(){
        //Usando mock via framework Mockito:
        Calculadora calc = mock(Calculadora.class);
        when(calc.somar("1+2")).thenReturn(10);
        int resultado = calc.somar("1+2");
        assertEquals(10,resultado);
    }
}