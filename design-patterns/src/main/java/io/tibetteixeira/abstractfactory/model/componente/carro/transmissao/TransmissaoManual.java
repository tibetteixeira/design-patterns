package io.tibetteixeira.abstractfactory.model.componente.carro.transmissao;

public class TransmissaoManual extends Transmissao {
    @Override
    public void especificao() {
        System.out.println("Transmissão manual");
    }
}
