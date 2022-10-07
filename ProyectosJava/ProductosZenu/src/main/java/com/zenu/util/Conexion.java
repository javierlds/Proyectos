/**
 * Para la conexion solo uso una instancia para conexion BD usando Singleton
 *
 * */

package com.zenu.util;

import java.sql.*;

public class Conexion {

    private static String url = "jdbc:mysql://localhost:3306/zenu";
    private static String user = "root";
    private static String pasw = "javier";
    private static Connection conexion = null;

    public static Connection getConnection() throws SQLException{
        if(conexion == null){ // la primera vez sera null y genera conexion, ya la segunda vez es difernte de null por tanto solo la devuelve
            conexion = DriverManager.getConnection(url,user,pasw);
        }
        return conexion; //se devuelve la conexion
    }
}