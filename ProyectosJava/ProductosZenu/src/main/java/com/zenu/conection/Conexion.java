package com.zenu.conection;

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

        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
}
