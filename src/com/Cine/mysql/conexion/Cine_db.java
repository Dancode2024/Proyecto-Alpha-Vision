package com.Cine.mysql.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cine_db {
    
    private static final String URL = "jdbc:mysql://localhost:3306/cine_db"; // URL de la base de datos
    private static final String USER = "root"; // Cambia a tu usuario de la BD
    private static final String PASSWORD = ""; // Cambia a tu contraseña de la BD

     public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Clase del controlador
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: no se encontró el controlador de MySQL.");
        }
        return connection;
    }
}
