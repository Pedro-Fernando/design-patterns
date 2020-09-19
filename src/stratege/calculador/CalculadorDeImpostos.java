package stratege.calculador;

import stratege.Orcamentos.Orcamento;
import stratege.impostos.interfaces.Imposto;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        System.out.println(imposto.calcula(orcamento));
    }

}
