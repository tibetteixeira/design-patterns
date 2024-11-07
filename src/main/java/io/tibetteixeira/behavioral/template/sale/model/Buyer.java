package io.tibetteixeira.behavioral.template.sale.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Buyer {

    private String name;
    private Double distance;
    private boolean specialClient;
}
