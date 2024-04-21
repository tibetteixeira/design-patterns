package io.tibetteixeira.singleton.antes.connection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Connection {

    private boolean disponivel = true;

    public void query(String query) {
        System.out.println(String.format("Executando a query `%s`", query));
    }
}
