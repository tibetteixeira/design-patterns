package io.tibetteixeira.creational.factorymethod.antes.model;

public class Pix implements Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Pix");
    }

}
