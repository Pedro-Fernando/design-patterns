package stratege.main;

import stratege.Orcamentos.Orcamento;
import stratege.calculador.CalculadorDeImpostos;
import stratege.impostos.ICMS;
import stratege.impostos.ISS;
import stratege.impostos.interfaces.Imposto;

public class Main {

    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(50.0);

        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);
    }
}
