package br.edu.go.puc.ads.domain.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SomaTest {

    @Test
    void testSoma() {
        Soma soma = new Soma(2.0, 3.0);
        double resultado = soma.getSoma();
        assertEquals(5.0, resultado, "A soma deveria ser 5.0");
    }
     
    @Test
    void testSomarPositivos(){
        Soma soma = new Soma( 1.0, 1.0);
        double resultado = soma.getSoma();
        assertEquals(2.0, resultado, "A soma deveria ser 2");
    }

    @Test
    void testSomarNegativos(){
        Soma soma = new Soma( -1.0, -1.0);
        double resultado = soma.getSoma();
        assertEquals(-2.0, resultado, "A soma deveria ser -2");
    }
    
    @Test
    void testSomarZero(){
        Soma soma = new Soma( 0.0, 0.0);
        double resultado = soma.getSoma();
        assertEquals(0.0, resultado, "A soma deveria ser 0");
    }


}
