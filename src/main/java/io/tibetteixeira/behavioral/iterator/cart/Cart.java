package io.tibetteixeira.behavioral.iterator.cart;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.String.format;

@NoArgsConstructor
public class Cart implements Iterable<Product> {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
        System.out.println(format("Product %s added", product));
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
