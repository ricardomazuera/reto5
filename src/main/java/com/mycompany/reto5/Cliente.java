package com.mycompany.reto5;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Cliente {
    public static Scanner scan = new Scanner (System.in);
    
    public static void ingresarCliente() throws SQLException{
        String sql = "INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = Reto5.conectar().prepareStatement(sql);

        System.out.print("Ingresa tu usuario: ");
        String usuario = scan.nextLine(); 
        statement.setString(1, usuario);
        
        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scan.nextLine();
        statement.setString(2, nombre);
        
        System.out.print("Ingresa tu email: ");
        String email = scan.nextLine();
        statement.setString(3, email);
        
        System.out.print("Ingresa tu celular: ");
        BigInteger celular = scan.nextBigInteger();  
        statement.setObject(4, celular);
        scan.nextLine();
        
        System.out.print("Ingresa tu clave: ");
        String clave = scan.nextLine();
        statement.setString(5, clave);
        
        System.out.print("Ingresa tu fecha nacimiento (AAAA-MM-DD): ");
        String fecha_nto = scan.nextLine();
        statement.setString(6, fecha_nto);
        
        int filasInsertadas = statement.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("Insert exitoso");
        }

    }
    
    public static void modificarNombre(){
        
    }
        
    public static void modificarCorreo(){
        
    }
        
    public static void borrarCliente(){
        
    }
}
