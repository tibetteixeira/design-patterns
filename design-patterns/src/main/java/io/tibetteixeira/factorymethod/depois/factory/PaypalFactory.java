package io.tibetteixeira.factorymethod.depois.factory;

import io.tibetteixeira.factorymethod.depois.model.Pagamento;
import io.tibetteixeira.factorymethod.depois.model.Paypal;

public class PaypalFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new Paypal();
    }
}
