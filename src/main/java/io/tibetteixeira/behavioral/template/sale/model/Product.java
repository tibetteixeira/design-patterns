package io.tibetteixeira.behavioral.template.sale.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Product {

    private String desc;
    private Double value;
    private Category category;
    private Double weight;
}
