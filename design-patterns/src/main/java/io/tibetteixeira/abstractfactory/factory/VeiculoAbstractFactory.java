package io.tibetteixeira.abstractfactory.factory;

import io.tibetteixeira.abstractfactory.model.componente.carro.chassi.Chassi;
import io.tibetteixeira.abstractfactory.model.componente.carro.motor.Motor;
import io.tibetteixeira.abstractfactory.model.componente.carro.transmissao.Transmissao;

public interface VeiculoAbstractFactory {
    Chassi criarChassi();
    Transmissao criarTransmissao();
    Motor criarMotor();
}
