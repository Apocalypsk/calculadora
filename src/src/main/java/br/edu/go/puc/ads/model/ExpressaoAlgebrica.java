package br.edu.go.puc.ads.model;

public class ExpressaoAlgebrica {

    private Double primeiroValor;
    private Double segundoValor;
    private OperacaoAlgebrica operacao;

    public ExpressaoAlgebrica() {
        
    }

    public ExpressaoAlgebrica( ExpressaoAlgebrica expressao ) {
        this.setOperacao(expressao.getOperacao());
        this.setPrimeiroValor(expressao.getPrimeiroValor());
        this.setSegundoValor(expressao.getSegundoValor());
    }
    
    public Double getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(Double primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public Double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(Double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public OperacaoAlgebrica getOperacao() {
        return operacao;
    }

    public void setOperacao(OperacaoAlgebrica operacao) {
        this.operacao = operacao;
    }

}
