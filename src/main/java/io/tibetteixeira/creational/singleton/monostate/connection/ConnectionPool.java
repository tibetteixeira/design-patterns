package io.tibetteixeira.creational.singleton.monostate.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.commons.lang3.BooleanUtils.isFalse;

// Diferença entre Singleton
// 1. Pode ser utilizado com interfaces
// 2. Torna a utilização das propriedades estáticos um pouco oculto,
// tendo em vista que não há indicação que é de fato uma propriedade estática.
// Diferente do Singleton que temos o método getInstance
public class ConnectionPool {

    private static final int POOL_SIZE = 2;
    private static final List<Connection> connectionsPool = new ArrayList<>();

    static {
        System.out.println("Criando connection pool");
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Optional<Connection> conexaoDisponivel = connectionsPool.stream()
                .filter(Connection::isDisponivel)
                .findAny();

        conexaoDisponivel.ifPresent(connection -> connection.setDisponivel(false));

        if (isFalse(conexaoDisponivel.isPresent()))
            System.out.println("Sem conexões disponíveis");

        return conexaoDisponivel.orElse(null);
    }

    public void liberarConexao(Connection connection) {
        connection.setDisponivel(true);
    }
}
