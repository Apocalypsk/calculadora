package br.edu.go.puc.ads.domain.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import br.edu.go.puc.ads.controller.CalculadoraController;

class CalculadoraControllerTest {

    @Test
    void testSomar() {
        CalculadoraController calculadora = new CalculadoraController();
        double resultado = calculadora.Somar(1.0, 2.0);
        assertEquals(3.0, resultado, "A soma deveria ser 3.0");
    }


    @Test
    void testSubtrair() {
        CalculadoraController calculadora = new CalculadoraController();
        double resultado = calculadora.Subtrair(2.0, 1.0);
        assertEquals(1.0, resultado, "A subtração deveria ser 1.0");
    }

    @Test
    void testMultiplicar() {
        CalculadoraController calculadora = new CalculadoraController();
        double resultado = calculadora.multiplicar(3.0, 2.0);
        assertEquals(6.0, resultado, "A multiplicação deveria ser 6.0");
    }

    @Test
    void testDividir() {
        CalculadoraController calculadora = new CalculadoraController();
        double resultado = calculadora.dividir(16.0, 2.0);
        assertEquals(8.0, resultado, "A divisão deveria ser 8.0");
    }


}
