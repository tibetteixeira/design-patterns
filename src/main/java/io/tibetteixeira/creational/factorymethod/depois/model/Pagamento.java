package io.tibetteixeira.creational.factorymethod.depois.model;

public abstract class Pagamento {
    public abstract void pagar();

    public void validarPagamento() {
        System.out.println("Validando pagamento...");
        System.out.println("Pagamento validado");
    }
}
