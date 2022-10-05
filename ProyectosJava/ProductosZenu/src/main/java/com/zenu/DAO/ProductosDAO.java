/*
* En esta clase es donde se realizan las operaciones DML sobre la BD
* */
package com.zenu.DAO;

import com.zenu.Productos;
import com.zenu.conection.Conexion;

public class ProductosDAO {

    public static void crearProductoDB(Productos producto){
        Conexion dbConect = new Conexion();
        dbConect.getConnection();

    }

    public static void leerProductoDB(){

    }

    public static void borrarProductoDB(int idProducto){

    }

    public static void actualizarProductoDB(Productos producto){

    }
}
