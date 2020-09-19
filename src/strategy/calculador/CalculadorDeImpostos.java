package strategy.calculador;

import strategy.Orcamentos.Orcamento;
import strategy.impostos.interfaces.Imposto;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){
        System.out.println(imposto.calcula(orcamento));
    }

}
