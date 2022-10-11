package com.pruebas.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pruebas.entitys.Producto;
import com.pruebas.repository.ProductoRepository;
import com.pruebas.service.ProductoService;

@Service("ProductoServiceImpl")
public class ProductoServiceImpl implements ProductoService{

	@Autowired // Inyeccion de dependencias
	@Qualifier("ProductoRepository")
	private ProductoRepository productoRepository;
	
	@Override
	public List<Producto> listarProductos() {
    	return (List<Producto>)productoRepository.findAll();
	}

	@Override
	public Optional<Producto> consultarProducto(Integer idProducto) {
		Optional<Producto> producto = productoRepository.findById(idProducto);
		if(producto.isPresent()) {
			return producto;
		}
		else {
			return null;
		}
	}
	
	@Override
	public Producto actualizarProducto(Producto producto){
		return productoRepository.save(producto);
	}
	

}