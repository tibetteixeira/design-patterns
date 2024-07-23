package io.tibetteixeira.creational.abstractfactory.model.componente.carro.transmissao;

public class TransmissaoAutomatica extends Transmissao {
    @Override
    public void especificao() {
        System.out.println("Transmissão automática");
    }
}
