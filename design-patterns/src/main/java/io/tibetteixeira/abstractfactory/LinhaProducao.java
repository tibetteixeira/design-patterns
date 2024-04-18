package io.tibetteixeira.abstractfactory;

import io.tibetteixeira.abstractfactory.factory.VeiculoAbstractFactory;
import io.tibetteixeira.abstractfactory.model.veiculo.Carro;
import io.tibetteixeira.abstractfactory.model.veiculo.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LinhaProducao {
    private VeiculoAbstractFactory factory;

    public Veiculo criarVeiculo() {
        return new Carro(factory.criarChassi(), factory.criarMotor(), factory.criarTransmissao());
    }
}
