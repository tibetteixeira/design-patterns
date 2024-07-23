package io.tibetteixeira.creational.abstractfactory.factory;

import io.tibetteixeira.creational.abstractfactory.model.componente.carro.chassi.Chassi;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.motor.Motor;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.transmissao.Transmissao;

public interface VeiculoAbstractFactory {
    Chassi criarChassi();
    Transmissao criarTransmissao();
    Motor criarMotor();
}
