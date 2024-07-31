package io.tibetteixeira.behavioral.iterator.cart;

import static java.lang.String.format;

public class App {

    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.add(new Product("Product 1", 21.99));
        cart.add(new Product("Product 2", 22.99));
        cart.add(new Product("Product 3", 23.99));

        for (var product : cart) {
            System.out.println(format("Showing product %s", product));
        }
    }
}
