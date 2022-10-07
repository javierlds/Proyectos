/*
* Metodos que va a recibir el menu
* encargada de pedir los datos del producto y envia los parametros a capa DAO
* */
package com.zenu.services;

import com.zenu.DAO.ProductosDAO;
import com.zenu.util.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class ProductosService {

    private Connection conn = null;

    public static void consultarProducto(int codigo) {
        ProductosDAO prdao = new ProductosDAO();
        prdao.consultarProducto(codigo);
    }

    public static void crearProducto(){

    }

    public static void listarProductos(){

    }

    public static void borrarProducto(){

    }

    public static void editarProducto(){

    }
}
