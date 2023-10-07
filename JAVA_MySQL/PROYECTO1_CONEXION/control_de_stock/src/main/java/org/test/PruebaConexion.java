package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimeZone=True&serverTimeZome=UTC",
                "jairo",
                "jairo");
        System.out.println("Cerrando Conexion");
        con.close();

    }
}
