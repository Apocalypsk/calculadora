

import static org.junit.gen5.api.Assertions.assertEquals;
import org.junit.gen5.api.Test;

import br.edu.go.puc.ads.domain.logic.Soma;
import br.edu.go.puc.ads.model.ExpressaoAlgebrica;
import br.edu.go.puc.ads.model.OperacaoAlgebrica;


class TestSoma {

    @Test
    public void testSomar() {
        
        Soma soma = new Soma(new ExpressaoAlgebrica(OperacaoAlgebrica.DIVISAO, 1.0, 1.0 ));
        
        Double resultado = soma.getSoma();
        assertEquals(5, resultado, "A soma deveria ser 5");

    }
}
