package io.tibetteixeira.factorymethod.antes;

import io.tibetteixeira.factorymethod.antes.model.CartaoCredito;
import io.tibetteixeira.factorymethod.antes.model.Pagamento;
import io.tibetteixeira.factorymethod.antes.model.Paypal;
import io.tibetteixeira.factorymethod.antes.model.Pix;

public class App {
    public static void main(String[] args) {
        String tipoPagamento = "CARTAO_CREDITO";
        Pagamento pagamento = definirPagamento(tipoPagamento);
        pagamento.pagar();
    }

    private static Pagamento definirPagamento(String tipoPagamento) {
        switch (tipoPagamento) {
            case "CARTAO_CREDITO":
                return new CartaoCredito();
            case "PAYPAL":
                return new Paypal();
            case "PIX":
                return new Pix();
            default:
                throw new RuntimeException("Tipo de pagamento inválido");
        }
    }


}
