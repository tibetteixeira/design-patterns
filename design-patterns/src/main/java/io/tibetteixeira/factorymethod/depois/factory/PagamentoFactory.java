package io.tibetteixeira.factorymethod.depois.factory;

import io.tibetteixeira.factorymethod.depois.model.Pagamento;

public abstract class PagamentoFactory {

    public static Pagamento definirPagamento(String tipoPagamento) {
        PagamentoFactory factory;

        switch (tipoPagamento) {
            case "CARTAO_CREDITO":
                factory = new CartaoCreditoFactory();
                break;
            case "PAYPAL":
                factory = new PaypalFactory();
                break;
            case "PIX":
                factory = new PixFactory();
                break;
            default:
                throw new RuntimeException("Tipo de pagamento inválido");
        }

        return factory.criarPagamento();
    }

    protected abstract Pagamento criarPagamento();
}
