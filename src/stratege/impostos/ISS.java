package stratege.impostos;

import stratege.Orcamentos.Orcamento;
import stratege.impostos.interfaces.Imposto;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
