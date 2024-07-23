package io.tibetteixeira.creational.factorymethod.antes.model;

public class CartaoCredito implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Cartão de crédito");
    }
}
