package br.edu.go.puc.ads.domain.logic;

import br.edu.go.puc.ads.model.ExpressaoAlgebrica;
import br.edu.go.puc.ads.model.OperacaoAlgebrica;

public class Multiplicacao {

        public Multiplicacao() {
        this.expressao = new ExpressaoAlgebrica();
        this.expressao.setOperacao(OperacaoAlgebrica.MULTIPLICACAO);
        this.expressao.setPrimeiroValor(0.0);
        this.expressao.setSegundoValor(0.0);
    }

    public Multiplicacao(Double primeiroValor, Double segundoValor) {
        this.expressao = new ExpressaoAlgebrica();
        this.expressao.setOperacao(OperacaoAlgebrica.MULTIPLICACAO);
        this.expressao.setPrimeiroValor(primeiroValor);
        this.expressao.setSegundoValor(segundoValor);
    }

    public Multiplicacao( ExpressaoAlgebrica expressao ){
        this.expressao = new ExpressaoAlgebrica(expressao);
    }

    private ExpressaoAlgebrica expressao;

    public ExpressaoAlgebrica getExpressao() {
        return expressao;
    }

    public void setExpressao(ExpressaoAlgebrica expressao) {
        this.expressao = expressao;
    }

    public Double getMultiplicacao(){
        Double resultado = this.expressao.getPrimeiroValor() * this.expressao.getSegundoValor();
        //Por algum motivo o java acha que existe -0.0
        if( resultado == -0.0 ){
            resultado = 0.0;
        }

        return resultado; 
    }

}
