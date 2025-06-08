package br.edu.go.puc.ads.domain.logic;

import br.edu.go.puc.ads.model.ExpressaoAlgebrica;
import br.edu.go.puc.ads.model.OperacaoAlgebrica;

public class Divisao {

    public Divisao() {
        this.expressao = new ExpressaoAlgebrica();
        this.expressao.setOperacao(OperacaoAlgebrica.DIVISAO);
        this.expressao.setPrimeiroValor(0.0);
        this.expressao.setSegundoValor(0.0);
    }

    public Divisao(Double primeiroValor, Double segundoValor) {
        this.expressao = new ExpressaoAlgebrica();
        this.expressao.setOperacao(OperacaoAlgebrica.DIVISAO);
        this.expressao.setPrimeiroValor(primeiroValor);
        this.expressao.setSegundoValor(segundoValor);
    }

    public Divisao( ExpressaoAlgebrica expressao ){
        this.expressao = new ExpressaoAlgebrica(expressao);
    }

    private ExpressaoAlgebrica expressao;

    public ExpressaoAlgebrica getExpressao() {
        return expressao;
    }

    public void setExpressao(ExpressaoAlgebrica expressao) {
        this.expressao = expressao;
    }

    public Double getDivisao(){
            
        Double resultado = this.expressao.getPrimeiroValor() / this.expressao.getSegundoValor() ;

        if( Double.isInfinite(resultado) ){
            throw new ArithmeticException("Erro: divisão por zero gerou um valor infinito!");
        }


        if (  Double.isNaN(resultado) ) {
            throw new ArithmeticException("Erro: divisão por zero gerou um valor infinito!");
        }
    

        return resultado; 
    }


}
