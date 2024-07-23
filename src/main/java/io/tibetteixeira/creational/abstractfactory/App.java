package io.tibetteixeira.creational.abstractfactory;

import io.tibetteixeira.creational.abstractfactory.factory.VeiculoAbstractFactory;
import io.tibetteixeira.creational.abstractfactory.factory.carro.CarroCombustivelFactory;
import io.tibetteixeira.creational.abstractfactory.model.veiculo.Veiculo;

public class App {
    public static void main(String[] args) {
        VeiculoAbstractFactory factory = new CarroCombustivelFactory();
        LinhaProducao linhaProducao = new LinhaProducao(factory);

        Veiculo veiculo = linhaProducao.criarVeiculo();
        veiculo.mostrarEspecificao();
    }
}
