package io.tibetteixeira.factorymethod.antes.model;

public class Paypal implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Paypal");
    }
}
