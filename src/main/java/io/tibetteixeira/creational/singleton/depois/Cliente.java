package io.tibetteixeira.creational.singleton.depois;

import io.tibetteixeira.creational.singleton.depois.connection.Connection;
import io.tibetteixeira.creational.singleton.depois.connection.ConnectionPool;

import static java.util.Objects.nonNull;

public class Cliente {

    public static void buscarTodos() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        if (nonNull(connection))
            connection.query("SELECT * FROM cliente");
    }

    public static void buscarInadimplentes() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        if (nonNull(connection))
            connection.query("SELECT * FROM cliente where inadimplente is true");
    }

    public static void buscarVips() {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();

        if (nonNull(connection))
            connection.query("SELECT * FROM cliente where vip is true");
    }

}
