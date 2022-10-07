/*
* En esta clase es donde se realizan las operaciones DML sobre la BD
* */
package com.zenu.DAO;

import com.zenu.Productos;
import com.zenu.util.Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductosDAO { // tambien se conoce como repository

    public Productos consultarProducto(int codigo){
        Productos pr = new Productos();
        try(  // es un try con recursos, hace automaticamente el auto close de la conexion y sentencia
              Connection conexion = Conexion.getConnection();
              Statement sentencia = conexion.createStatement();
              ResultSet resultado = sentencia.executeQuery("SELECT * FROM producto")){

            while(resultado.next()){
                pr.setCodigo(resultado.getInt("CODIGO"));
                pr.setNombre(resultado.getString("NOMBRE"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return pr;
    }

    public static void crearProductoDB(Productos producto){

    }

    public static void borrarProductoDB(int idProducto){

    }

    public static void actualizarProductoDB(Productos producto){

    }
}
