package io.tibetteixeira.creational.factorymethod.depois.factory;

import io.tibetteixeira.creational.factorymethod.depois.model.Pagamento;
import io.tibetteixeira.creational.factorymethod.depois.model.Paypal;

public class PaypalFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new Paypal();
    }
}
