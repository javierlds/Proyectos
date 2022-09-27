package com.bolsaideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")  // ruta de primer nivel raiz base a todos los metodos del controlador y las de get mapping  son de segundo nivel ejemplo http://localhost:8080/app/index
public class IndexController {
	
	// @RequestMapping(value = "/index", method=RequestMethod.GET) //Esta anotacion permite mapear, es decir cada vez que se copie en el navegador http localhost index ejecutara este metodo
	// @GetMapping es lo mismo que la linea de arriba
	@GetMapping({"/index","/","home"}) // los valores entre comillas siempre comienza /index si se copia esto ejecuta este metodo, asi como home o solo /
	public String index(Model model) { //Cada metodo manejara una pagina diferente.  //interfaz Model: contiene metodos abstractos para pasar datos a la vista
		model.addAttribute("titulo","Hola spring framework");
		return "index";  // retorna la pagina index
	}
}
