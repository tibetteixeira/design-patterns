package io.tibetteixeira.factorymethod.antes.model;

public class CartaoCredito implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Cartão de crédito");
    }
}
