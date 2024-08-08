package io.tibetteixeira.behavioral.memento;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = false)
public class Product {

    private Integer id;
    private String description;
    private Double price;

    public Product(Product product) {
        this.id = product.getId();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }

    public ProductMemento save() {
        return new ProductMemento(new Product(this));
    }

    public void restore(ProductMemento memento) {
        System.out.println(memento.getState());
    }

    public void update(String description, Double price) {
        this.description = description;
        this.price = price;
    }

    public static class ProductMemento implements Memento {

        private Product product;

        public ProductMemento(Product product) {
            this.product = product;
        }

        private Product getState() {
            return product;
        }
    }
}
