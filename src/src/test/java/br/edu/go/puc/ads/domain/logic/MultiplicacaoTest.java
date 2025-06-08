package br.edu.go.puc.ads.domain.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MultiplicacaoTest {

    @Test
    void testMultiplicarPositivos(){
        Multiplicacao multiplicacao = new Multiplicacao(2.0, 2.0);
        double resultado = multiplicacao.getMultiplicacao();
        assertEquals(4.0, resultado, "A multiplicação deveria ser 4,0");

    }

    @Test
    void testMultiplicarDoisNegativos(){
        Multiplicacao multiplicacao = new Multiplicacao(-5.0, -2.0);
        double resultado = multiplicacao.getMultiplicacao();
        assertEquals(10.0, resultado, "A multiplicação deveria ser 10,0.");

    }

    @Test
    void testMultiplicarUmsNegativo(){
        Multiplicacao multiplicacao = new Multiplicacao(-5.0, 2.0);
        double resultado = multiplicacao.getMultiplicacao();
        assertEquals(-10.0, resultado, "A multiplicação deveria ser -10,0.");

    }

    @Test
    void testMultiplicarUmNumeroPorZero(){
        Multiplicacao multiplicacao = new Multiplicacao(0.0, 1.0);
        double resultado = multiplicacao.getMultiplicacao();
        assertEquals(0.0, resultado, "A multiplicação deveria ser 0,0.");

    }

    @Test
    void testMultiplicarZeroPorZero(){
        Multiplicacao multiplicacao = new Multiplicacao(0.0, 0.0);
        double resultado = multiplicacao.getMultiplicacao();
        assertEquals(0.0, resultado, "A multiplicação deveria ser 0,0.");

    }

    @Test
    void testMultiplicarNegativoPorZero(){
        Multiplicacao multiplicacao = new Multiplicacao(-1.0, 0.0);
        double resultado = multiplicacao.getMultiplicacao();
        assertEquals(0.0, resultado, "A multiplicação deveria ser 0,0.");

    }

}
