package io.tibetteixeira.creational.singleton.depois.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.commons.lang3.BooleanUtils.isFalse;

public class ConnectionPool {

    private static final int POOL_SIZE = 2;
    private static final ConnectionPool singleton = new ConnectionPool();
    private final List<Connection> connectionsPool = new ArrayList<>();

    private ConnectionPool() {
        System.out.println("Criando connection pool");
        for (int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public static ConnectionPool getInstance() {
        return singleton;
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
