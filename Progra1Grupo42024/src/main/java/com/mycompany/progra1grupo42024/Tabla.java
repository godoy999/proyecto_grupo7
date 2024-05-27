
package com.mycompany.progra1grupo42024;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Tabla{

   public void AguardarCarro(int ID, String Marca, String Color, String Combustible) {
        String Guarda = "INSERT INTO carro (ID, Marca, Color, Combustible) VALUES (?, ?,?,?)";

        try (Connection connection = Conexion.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(Guarda)) {

            preparedStatement.setInt(1, ID);
            preparedStatement.setString(2, Marca);
            preparedStatement.setString(3, Color);
            preparedStatement.setString(4, Combustible);
            preparedStatement.executeUpdate();

            System.out.println("Datos guardados exitosamente!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
