package com.zenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection(){
        Connection conection = null;
        String host = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pasw = "javier";
        try{
            conection = DriverManager.getConnection(host,user,pasw);
            if(conection != null){
                System.out.println("Conexion exitosa.");
            }

        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
