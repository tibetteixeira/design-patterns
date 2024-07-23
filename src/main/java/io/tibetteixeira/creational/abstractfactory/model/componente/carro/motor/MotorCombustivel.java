package io.tibetteixeira.creational.abstractfactory.model.componente.carro.motor;

public class MotorCombustivel extends Motor {
    @Override
    public void especificao() {
        System.out.println("Motor a combustível");
    }
}
