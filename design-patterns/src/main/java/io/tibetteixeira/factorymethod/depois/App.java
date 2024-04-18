package io.tibetteixeira.factorymethod.depois;

import io.tibetteixeira.factorymethod.depois.factory.PagamentoFactory;
import io.tibetteixeira.factorymethod.depois.model.Pagamento;

public class App {
    public static void main(String[] args) {
        String tipoPagamento = "PAYPAL";

        Pagamento pagamento = PagamentoFactory.definirPagamento(tipoPagamento);
        pagamento.pagar();
        pagamento.validarPagamento();
    }
}
