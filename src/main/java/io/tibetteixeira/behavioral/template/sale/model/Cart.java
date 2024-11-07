package io.tibetteixeira.behavioral.template.sale.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cart {

    private Buyer buyer;
    private List<Product> items;
}
