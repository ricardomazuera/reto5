/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reto5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @authores:
 * Ruth Viviana Theran Tovar
 * Rosa Mariana Silva Garavito
 * Ricardo Andres Mazuera Parra
 */
public class Reto5 {
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) throws SQLException  {
        menu();
        Scanner in = new Scanner(System.in);
        int opcion = Integer.parseInt(in.nextLine());
        
        while (opcion != 8) {
            if (opcion == 1) {
                Cliente.ingresarCliente();
            } else if (opcion == 2) {
                Biblioteca.ingresarBiblioteca();
            }
            menu();
            opcion = Integer.parseInt(in.nextLine());
        }
        in.close();
        
        
    }
    

//                case 3:
//                    Cliente.modificarNombre();
//                    break;
//                case 4:
//                    Cliente.modificarCorreo();
//                    break;
//                case 5:
//                    Biblioteca.modificarContenido();
//                    break;
//                case 6:
//                    Cliente.borrarCliente();
//                    break;
//                case 7:
//                    Biblioteca.borrarBiblioteca();
//                    break;

    
    
    public static void menu (){
        try {
            System.out.println(
                "\n\n*************\n" +
                "CRUD MYSQL\n" +
                "*************\n" +
                " Opciones: \n" +
                "1.\tIngresar datos cliente \n" +
                "2.\tIngresar datos biblioteca \n" +
                "-----------------------------------------\n" +
                "3.\tModificar nombre cliente \n" +
                "4.\tModificar correo cliente \n" +
                "5.\tModificar contenido biblioteca \n" +
                "-----------------------------------------\n" +
                "6.\tBorrar cliente \n" +
                "7.\tBorrar contenido biblioteca \n" +
                "-----------------------------------------\n" +
                "8. \tSalir \n"
            );
            System.out.print(">> ");

        } catch (Exception e) {
            System.out.println("Gracias por venir. Vuelve pronto");
        }
    }

    public static Connection conectar() {
        String jdbcURL = "jdbc:mysql://localhost:3306/nombre_BD";
        String user = "root";
        String password = "*****";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcURL, user, password);
            if (conn != null) {
                System.out.println("* Conectado *");
                System.out.println("-------------");
            }
        } catch (SQLException error) {
            System.out.println("Error: " + error.getErrorCode() + " " + error.getMessage());
        }
        return conn;
    }
}
