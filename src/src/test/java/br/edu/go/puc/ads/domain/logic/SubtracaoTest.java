package br.edu.go.puc.ads.domain.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SubtracaoTest {

    @Test
    void testSubrairPositivos() {
        Subtracao subtracao = new Subtracao(2.0, 1.0);
        double resultado = subtracao.getSubtracao();
        assertEquals(1.0, resultado, "A subtração deveria ser 1.0");
    }

    @Test
    void testSubrairNegativos(){
        Subtracao subtracao = new Subtracao( -2.0, -1.0);
        double resultado = subtracao.getSubtracao();
        assertEquals( -1.0, resultado, "A subtração deveria ser -1.0");
    }
    
    @Test
    void testSubrairZero(){
        Subtracao subtracao = new Subtracao( 0.0, 0.0);
        double resultado = subtracao.getSubtracao();
        assertEquals( 0.0, resultado, "A subtração deveria ser 0.0");
    }


}
