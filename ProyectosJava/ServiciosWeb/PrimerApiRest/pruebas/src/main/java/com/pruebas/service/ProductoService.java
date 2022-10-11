package com.pruebas.service;

import java.util.List;
import java.util.Optional;

import com.pruebas.entitys.Producto;

public interface ProductoService {
	
	public List<Producto> listarProductos();
	public Optional<Producto> consultarProducto(Integer idProducto);
	public Producto actualizarProducto(Producto producto);
	
	

}
