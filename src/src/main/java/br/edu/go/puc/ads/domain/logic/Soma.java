package br.edu.go.puc.ads.domain.logic;


import br.edu.go.puc.ads.model.ExpressaoAlgebrica;
import br.edu.go.puc.ads.model.OperacaoAlgebrica;

public class Soma {
    

    public Soma() {
        this.expressao = new ExpressaoAlgebrica();
        this.expressao.setOperacao(OperacaoAlgebrica.SOMA);
        this.expressao.setPrimeiroValor(0.0);
        this.expressao.setSegundoValor(0.0);
    }

    public Soma( ExpressaoAlgebrica expressao ){
        this.expressao = new ExpressaoAlgebrica(expressao);
    }

    private ExpressaoAlgebrica expressao;

    public ExpressaoAlgebrica getExpressao() {
        return expressao;
    }

    public void setExpressao(ExpressaoAlgebrica expressao) {
        this.expressao = expressao;
    }

    public Double getSoma(){
        Double resultado = this.expressao.getPrimeiroValor() + this.expressao.getSegundoValor();
        return resultado; 
    }

}
