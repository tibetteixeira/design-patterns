package io.tibetteixeira.creational.factorymethod.depois;

import io.tibetteixeira.creational.factorymethod.depois.factory.PagamentoFactory;
import io.tibetteixeira.creational.factorymethod.depois.model.Pagamento;

public class App {
    public static void main(String[] args) {
        String tipoPagamento = "PAYPAL";

        Pagamento pagamento = PagamentoFactory.definirPagamento(tipoPagamento);
        pagamento.pagar();
        pagamento.validarPagamento();
    }
}
