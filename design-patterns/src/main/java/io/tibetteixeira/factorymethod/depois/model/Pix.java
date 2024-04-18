package io.tibetteixeira.factorymethod.depois.model;

public class Pix extends Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pago com Pix");
    }

}
