package com.zenu;

import java.sql.Connection;
import java.sql.SQLException;

public class Inicio {

    public static void main(String args[]){
        Conexion con = new Conexion();
        try(Connection cnx = con.getConnection()){

        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
