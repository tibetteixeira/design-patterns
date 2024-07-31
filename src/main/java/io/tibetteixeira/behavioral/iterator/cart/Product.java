package io.tibetteixeira.behavioral.iterator.cart;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString(of = {"description"}, includeFieldNames = false)
public class Product {
    private String description;
    private Double price;
}
