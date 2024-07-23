package io.tibetteixeira.creational.abstractfactory.factory.carro;

import io.tibetteixeira.creational.abstractfactory.model.componente.carro.chassi.Chassi;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.chassi.ChassiReforcado;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.motor.Motor;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.motor.MotorEletrico;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.transmissao.Transmissao;
import io.tibetteixeira.creational.abstractfactory.model.componente.carro.transmissao.TransmissaoAutomatica;

public class CarroEletricoFactory extends CarroAbstractFactory {
    @Override
    public Chassi criarChassi() {
        return new ChassiReforcado();
    }

    @Override
    public Transmissao criarTransmissao() {
        return new TransmissaoAutomatica();
    }

    @Override
    public Motor criarMotor() {
        return new MotorEletrico();
    }
}
