package stratege.impostos;

import stratege.Orcamentos.Orcamento;
import stratege.impostos.interfaces.Imposto;

public class ICCC implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
       if (orcamento.getValor() < 1000.00){
           return orcamento.getValor() * 0.05;
       }else if (orcamento.getValor() <= 3000.00){
           return orcamento.getValor() * 0.07;
       }else{
           return orcamento.getValor() * 0.07;
       }
    }
}
