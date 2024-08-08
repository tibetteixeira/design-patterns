package io.tibetteixeira.behavioral.memento;

public class App {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Product product = new Product(1, "Phone", 119.99);
        caretaker.add(product.save());

        product.update("Phone", 134.99);
        caretaker.add(product.save());

        product.update("Phone 10% off", 121.49);
        caretaker.add(product.save());

        product.update("Phone 20% off", 107.99);
        caretaker.add(product.save());

        System.out.println("----- HISTORY ----");
        caretaker.getHistoryList().forEach(item -> product.restore((Product.ProductMemento) item));

        System.out.println("---- Original price ----");
        product.restore((Product.ProductMemento) caretaker.get(0));
    }


}
