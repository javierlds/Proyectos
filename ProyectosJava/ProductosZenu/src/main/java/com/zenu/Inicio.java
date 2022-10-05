package com.zenu;

import com.zenu.conection.Conexion;
import com.zenu.services.ProductosService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("********** Menu principal********** \n");
            System.out.println("1. Crear producto \n");
            System.out.println("2. Listar productos \n");
            System.out.println("3. Editar producto \n");
            System.out.println("4. Eliminar producto \n");
            System.out.println("5. Salir \n");
            opcion = Integer.valueOf(scan.nextLine());

            switch(opcion){
                case 1:
                    ProductosService.crearProducto();
                    break;
                case 2:
                    ProductosService.listarProductos();
                    break;
                case 3:
                    ProductosService.editarProducto();
                    break;
                case 4:
                    ProductosService.borrarProducto();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while(opcion != 5);

        Conexion con = new Conexion();
        try(Connection cnx = con.getConnection()){

        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
