package com.mycompany.reto5;

import static com.mycompany.reto5.Cliente.scan;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Biblioteca {
    public static void ingresarBiblioteca() throws SQLException {
        String sql = "INSERT INTO biblioteca VALUES (?, ?, ?, ?)";
        PreparedStatement statement = Reto5.conectar().prepareStatement(sql);

        System.out.print("Ingresa ID: ");
        int id = Integer.parseInt(scan.nextLine()); 
        statement.setInt(1, id);
//      scan.nextLine();
        
        System.out.print("Ingresa tu usuario: ");
        String usuario = scan.nextLine();
        statement.setString(2, usuario);
        
        System.out.print("Ingresa tu contenido: ");
        int contenido = Integer.parseInt(scan.nextLine()); 
        statement.setInt(3, contenido);
//      scan.nextLine();
        
        statement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
        
        int filasInsertadas = statement.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("Insert exitoso");
        }
    }
    
    public static void modificarContenido() {
        
    }
    public static void borrarBiblioteca() {
        
    }
    
}
