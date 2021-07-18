package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
Test driven Developement. Criado a partir de 2002.
	Funciona assim:
	Adiciona teste → Teste falha → Escreve código → Roda teste → Refatora → Adiciona teste
	Um programa criado com um teste em mente visará resolver um problema.
	Ao precisar passar em um teste, a classe e objetos terá menos acúmulo de funções.
 */
public class CalculadoraTDDTest {
    @Test
    public void deveSomarDoisValores(){
        int valorA = 1;
        int valorB = 2;
        int soma = 0;
        assertEquals(3,soma);
    }
}
