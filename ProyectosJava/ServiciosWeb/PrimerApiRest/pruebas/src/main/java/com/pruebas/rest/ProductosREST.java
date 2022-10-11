/*
 * JPA => Objeto relacional CLASES a instrucciones SQL, la respuesta convertirla en objetos
 * */
package com.pruebas.rest;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pruebas.entitys.*;
import com.pruebas.repository.ProductoRepository;
import com.pruebas.service.ProductoService;

import org.apache.commons.logging.*;


@RestController
@RequestMapping("/productos")
public class ProductosREST {
	
	public static final Log LOGGER = LogFactory.getLog(ProductosREST.class);
	
	
	@Autowired // Inyeccion de dependencias
	private ProductoService productoService;
	
	@GetMapping("/listarProducto")
	public ResponseEntity<List<Producto>> getProducto(){ //Response Entity me permite retornar un JSON
		
		/*producto.setCodigo(100);
		producto.setDescripcion("Computador de escritorio");
		producto.setNombre("Dell 001");*/ //
		LOGGER.info("Llamando getProducto");
		return ResponseEntity.ok(productoService.listarProductos()); //me retorna un json
	}
	// Asi se veria en el navegador = http://localhost:8080/productos/ConsultarProducto?codigoPr=200
	@GetMapping("/ConsultarProducto")
	public ResponseEntity<Producto> getProductoId(@RequestParam(name = "codigoPr")Integer codigoPr){

		//Opcion 1=> Utilizando HttpServletRequest request
		//Optional<Producto> optionalProducto = productoRepository.findById(Integer.parseInt(request.getParameter("codigoProducto"))); //el objeto de dentro no esta inicializado, puede salir NULL POINTER EXCEPTION
		//Opcion 2 => Utilizanodo @RequestParam
		LOGGER.info("****************** Consultando el producto: " + codigoPr);
  	   return ResponseEntity.ok(productoService.consultarProducto(codigoPr).get()); //me retorna un json //.get retorna de tipo Producto
		//	return ResponseEntity.noContent().build();	
	}
	
	
	@GetMapping("/InsertarProducto")
	
	//@GetMapping //exponer un servicio toma como URL la base   -> localhos:8080
	//@RequestMapping(value = "hello", method=RequestMethod.GET) // Para personalizar la URL
	public String hello() {
		return "hello world";
	}

}
