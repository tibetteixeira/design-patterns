package io.tibetteixeira.singleton.monostate;

import io.tibetteixeira.singleton.monostate.connection.Connection;
import io.tibetteixeira.singleton.monostate.connection.ConnectionPool;

import static java.util.Objects.nonNull;

public class Cliente {

    public static void buscarTodos() {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();

        if (nonNull(connection))
            connection.query("SELECT * FROM cliente");
    }

    public static void buscarInadimplentes() {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();

        if (nonNull(connection))
            connection.query("SELECT * FROM cliente where inadimplente is true");
    }

    public static void buscarVips() {
        ConnectionPool pool = new ConnectionPool();
        Connection connection = pool.getConnection();

        if (nonNull(connection))
            connection.query("SELECT * FROM cliente where vip is true");
    }

}
