package com.zenu;

import com.zenu.services.ProductosService;

import java.util.Scanner;

public class Inicio {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        int codigoProducto;
        do{
            System.out.println("********** Menu principal********** \n");
            System.out.println("1. Consultar producto \n");
            System.out.println("2. Listar productos \n");
            System.out.println("3. Editar producto \n");
            System.out.println("4. Eliminar producto \n");
            System.out.println("5. Salir \n");
            opcion = Integer.valueOf(scan.nextLine());

            switch(opcion){
                case 1:
                    System.out.println("Ingrese codigo de producto a consultar: ");
                    codigoProducto = Integer.valueOf(scan.nextLine());
                    ProductosService.consultarProducto(codigoProducto);
                case 2:
                    ProductosService.crearProducto();
                    break;
                case 3:
                    ProductosService.listarProductos();
                    break;
                case 4:
                    ProductosService.editarProducto();
                    break;
                case 5:
                    ProductosService.borrarProducto();
                    break;
                case 6:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }while(opcion != 6);

    }
}
