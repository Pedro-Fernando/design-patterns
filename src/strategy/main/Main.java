package strategy.main;

import strategy.Orcamentos.Orcamento;
import strategy.calculador.CalculadorDeImpostos;
import strategy.impostos.ICMS;
import strategy.impostos.ISS;
import strategy.impostos.interfaces.Imposto;

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
