package io.tibetteixeira.creational.factorymethod.depois.factory;

import io.tibetteixeira.creational.factorymethod.depois.model.Pagamento;
import io.tibetteixeira.creational.factorymethod.depois.model.Pix;

public class PixFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }
}
