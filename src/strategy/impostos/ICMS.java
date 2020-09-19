package strategy.impostos;

import strategy.Orcamentos.Orcamento;
import strategy.impostos.interfaces.Imposto;

public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
