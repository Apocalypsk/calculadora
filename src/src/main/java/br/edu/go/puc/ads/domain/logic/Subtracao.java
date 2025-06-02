package br.edu.go.puc.ads.domain.logic;

import br.edu.go.puc.ads.model.ExpressaoAlgebrica;
import br.edu.go.puc.ads.model.OperacaoAlgebrica;

public class Subtracao {

        public Subtracao() {
        this.expressao = new ExpressaoAlgebrica();
        this.expressao.setOperacao(OperacaoAlgebrica.SUBTRACAO);
        this.expressao.setPrimeiroValor(0.0);
        this.expressao.setSegundoValor(0.0);
    }

    public Subtracao( ExpressaoAlgebrica expressao ){
        this.expressao = new ExpressaoAlgebrica(expressao);
    }

    private ExpressaoAlgebrica expressao;

    public ExpressaoAlgebrica getExpressao() {
        return expressao;
    }

    public void setExpressao(ExpressaoAlgebrica expressao) {
        this.expressao = expressao;
    }

    public Double getSubtracao(){
        Double resultado = this.expressao.getPrimeiroValor() - this.expressao.getSegundoValor();
        return resultado; 
    }

}
