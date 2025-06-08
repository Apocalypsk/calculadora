package br.edu.go.puc.ads.domain.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class DivisaoTest {

    @Test
    void testDividirPositivos(){
        Divisao divisao = new Divisao(2.0, 2.0);
        Double resultado = divisao.getDivisao();
        assertEquals(1.0, resultado, "A Divisão deveria ser 1,0.");

    }

    @Test
    void testDividirDoisNegativos(){
        Divisao divisao = new Divisao(-5.0, -2.0);
        Double resultado = divisao.getDivisao();
        assertEquals(2.5, resultado, "A Divisão deveria ser 2,5.");

    }

    @Test
    void testDividirUmNumeroNegativo(){
        Divisao divisao = new Divisao(-5.0, 2.0);
        Double resultado = divisao.getDivisao();
        assertEquals(-2.5, resultado, "A Divisão deveria ser -2,5.");

    }

    @Test
    void testDividirPorUmNumeroNegativo(){
        Divisao divisao = new Divisao(5.0, -2.0);
        Double resultado = divisao.getDivisao();
        assertEquals(-2.5, resultado, "A Divisão deveria ser -2,5.");

    }

    @Test
    void testDividirZeroPorUmNumero(){
        Divisao divisao = new Divisao(0.0, 1.0);
        Double resultado = divisao.getDivisao();
        assertEquals(0.0, resultado, "A Divisão deveria ser 0,0.");

    }

    @Test
    void testDividirUmNumeroPorZero(){
        Divisao divisao = new Divisao(1.0, 0.0);

        assertThrows(ArithmeticException.class, () -> {
            divisao.getDivisao(); // Deve lançar a exceção
        });

    }

    @Test
    void testDividirZeroPorZero(){
        
        Divisao divisao = new Divisao(0.0, 0.0);
         
        assertThrows(ArithmeticException.class, () -> {
            divisao.getDivisao(); // Deve lançar a exceção
        });


    }


}
