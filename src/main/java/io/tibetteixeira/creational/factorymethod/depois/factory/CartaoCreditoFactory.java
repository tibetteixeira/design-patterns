package io.tibetteixeira.creational.factorymethod.depois.factory;

import io.tibetteixeira.creational.factorymethod.depois.model.CartaoCredito;
import io.tibetteixeira.creational.factorymethod.depois.model.Pagamento;

public class CartaoCreditoFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new CartaoCredito();
    }
}
