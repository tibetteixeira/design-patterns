package io.tibetteixeira.abstractfactory.model.veiculo;

import io.tibetteixeira.abstractfactory.model.componente.carro.chassi.Chassi;
import io.tibetteixeira.abstractfactory.model.componente.carro.motor.Motor;
import io.tibetteixeira.abstractfactory.model.componente.carro.transmissao.Transmissao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro extends Veiculo {

    public Carro(Chassi chassi, Motor motor, Transmissao transmissao, String marca, String modelo, Integer ano) {
        super(chassi, motor, transmissao, marca, modelo, ano);
    }

    public Carro(Chassi chassi, Motor motor, Transmissao transmissao) {
        super(chassi, motor, transmissao);
    }
}
