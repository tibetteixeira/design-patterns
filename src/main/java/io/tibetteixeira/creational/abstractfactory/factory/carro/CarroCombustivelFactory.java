package io.tibetteixeira.creational.abstractfactory.factory.carro;

import io.tibetteixeira.creational.abstractfactory.model.componente.carro.chassi.Chassi;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.chassi.ChassiPadrao;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.motor.Motor;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.motor.MotorCombustivel;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.transmissao.Transmissao;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.transmissao.TransmissaoManual;

public class CarroCombustivelFactory extends CarroAbstractFactory {
    @Override
    public Chassi criarChassi() {
        return new ChassiPadrao();
    }

    @Override
    public Transmissao criarTransmissao() {
        return new TransmissaoManual();
    }

    @Override
    public Motor criarMotor() {
        return new MotorCombustivel();
    }
}
