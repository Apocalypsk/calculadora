package br.edu.go.puc.ads.controller;

import br.edu.go.puc.ads.domain.logic.Divisao;
import br.edu.go.puc.ads.domain.logic.Multiplicacao;
import br.edu.go.puc.ads.domain.logic.Soma;
import br.edu.go.puc.ads.domain.logic.Subtracao;

public class CalculadoraController {

    public Double Somar( Double primeiroValor, Double segundoValor ) {
        Soma soma = new Soma(primeiroValor, segundoValor);
        return soma.getSoma();        
    }


    public Double Subtrair( Double primeiroValor, Double segundoValor ) {
        Subtracao subtracao = new Subtracao(primeiroValor, segundoValor);
        return subtracao.getSubtracao();        
    }


    public Double multiplicar( Double multiplicando, Double multiplicador ){
        Multiplicacao multiplicacao = new Multiplicacao(multiplicando, multiplicador);
        return multiplicacao.getMultiplicacao();
    }

    public Double dividir( Double dividendo, Double divisor){
        Divisao divisao = new Divisao(dividendo, divisor);
        return divisao.getDivisao();
    }


}
