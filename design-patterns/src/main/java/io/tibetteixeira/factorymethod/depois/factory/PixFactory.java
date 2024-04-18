package io.tibetteixeira.factorymethod.depois.factory;

import io.tibetteixeira.factorymethod.depois.model.Pagamento;
import io.tibetteixeira.factorymethod.depois.model.Pix;

public class PixFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }
}
