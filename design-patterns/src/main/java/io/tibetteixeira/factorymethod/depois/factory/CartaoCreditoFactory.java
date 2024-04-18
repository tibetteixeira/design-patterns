package io.tibetteixeira.factorymethod.depois.factory;

import io.tibetteixeira.factorymethod.depois.model.CartaoCredito;
import io.tibetteixeira.factorymethod.depois.model.Pagamento;

public class CartaoCreditoFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new CartaoCredito();
    }
}
