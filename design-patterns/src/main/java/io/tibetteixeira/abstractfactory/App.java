package io.tibetteixeira.abstractfactory;

import io.tibetteixeira.abstractfactory.factory.VeiculoAbstractFactory;
import io.tibetteixeira.abstractfactory.factory.carro.CarroCombustivelFactory;
import io.tibetteixeira.abstractfactory.model.veiculo.Veiculo;

public class App {
    public static void main(String[] args) {
        VeiculoAbstractFactory factory = new CarroCombustivelFactory();
        LinhaProducao linhaProducao = new LinhaProducao(factory);

        Veiculo veiculo = linhaProducao.criarVeiculo();
        veiculo.mostrarEspecificao();
    }
}
