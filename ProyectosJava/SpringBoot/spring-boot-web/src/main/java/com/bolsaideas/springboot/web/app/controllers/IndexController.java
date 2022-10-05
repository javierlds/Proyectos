package com.bolsaideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsaideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app") // ruta de primer nivel raiz base a todos los metodos del controlador y las de get mapping  son de segundo nivel ejemplo http://localhost:8080/app/index
public class IndexController {
	
	// @RequestMapping(value = "/index", method=RequestMethod.GET) //Esta anotacion permite mapear, es decir cada vez que se copie en el navegador http localhost index ejecutara este metodo
	// @GetMapping es lo mismo que la linea de arriba
	@GetMapping({"/index","/","home"}) // los valores entre comillas siempre comienza /index si se copia esto ejecuta este metodo, asi como home o solo /
	public String index(Model model) { //Cada metodo manejara una pagina diferente.  //interfaz Model: contiene metodos abstractos para pasar datos a la vista
		model.addAttribute("titulo","Hola spring framework");
		return "index";  // retorna la pagina index, por debajo maneja de forma automatica el .html
	}
	
	@RequestMapping("/perfil") // por defecto es get  // este objeto se lo pasaremos a la vista
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setApellido("Paez");
		usuario.setEmail("javierlds@gmail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";   // devuelve la pagina perfil.html
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Javier","Paez", "javierlds@gmail.com"));
		usuarios.add(new Usuario("Jose","Perez", "joperez@gmail.com"));
		usuarios.add(new Usuario("Ana","Rubiano", "arubiano@gmail.com"));
		usuarios.add(new Usuario("Yuri","Santos", "yurisan@gmail.com"));
		model.addAttribute("titulo", "Listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		
		//otra forma de crear una lista es con Arrays.asList que pone todos los elementos separados por comas
		
		return "listar";
	}
	
	@RequestMapping("/listarModelAtr")
	public String listarModel(Model model) {
		model.addAttribute("titulo3", "Listado usando model atribute");
		return "listarModelAtr";
	}
	
	
	@ModelAttribute("usuarios3")  //este me reemplaza utilizar Model model y hacer model.addAtribute, pasando a la vista. Se usa cuando sea comunes a varios metodos handler
	//este metodo es comun a todo el controlador y puede ser usado en cualquier vista
	public List<Usuario> poblarUsuarios(){
		List<Usuario>usuarios3 = Arrays.asList(
				new Usuario("Javier","Paez", "javierlds@gmail.com"),
				new Usuario("Jose","Perez", "joperez@gmail.com"),
				new Usuario("Ana","Rubiano", "arubiano@gmail.com"),
				new Usuario("Yuri","Santos", "yurisan@gmail.com"),
				new Usuario("Diego","Paez", "diegoPaez@gmail.com"),
				new Usuario("Sofia","Castañeda", "sofcas@gmail.com"),
				new Usuario("Alex","Urrea", "aurre@gmail.com"),
				new Usuario("David","Ortiz", "dortiz@gmail.com"));
		return usuarios3; // se retorna la lista 
	}
}
