

package com.mycompany.progra1grupo42024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;


public class Conexion {
    private static String Direccion = "jdbc:mariadb://localhost:3307/prueba";
    private static String Usuario = "root";
    private static String Password = "6920";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Direccion, Usuario, Password);
    }
 /*public static void main(String[] args) {
    
   try{
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307","root","6920");
       Statement s = c.createStatement();
     //  s.execute("create database prueba");
       System.out.println("Se ha conectado a la Base de Datos");
        
        }catch(Exception e){
        System.out.println("Error");
        System.out.println(e);
        } 
        }
 public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(c);
    }*/
}


