package com.bolsaideas.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // indica que es un controlador
@RequestMapping("/params")  //dar una ruta base
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	// este metodo lo que busca es obtener los parametros desde la URL tipo get	
	@GetMapping("/string")  // lo que debe ir en la url
	public String param(@RequestParam(name = "textoUrl", required=false, defaultValue ="valor por defecto") String texto, Model model) { //Obtener un parametro se obtiene con @RequestParam texto es el nombre del argumento del metodo, pero textoUrl es el que se debe colocar en el navegador ?textoUrl=parametroenviando
		//name/value = es el nombre del parametro que reconoce la URL
		// required = false => sirve para que no sea obligatorio este parametro
		// defaultValue => es el valor por defecto a mostrar 
		model.addAttribute("resultado", "El texto enviado es : " + texto); // "resultado" es lo que reconoce la vista
		return "params/ver";  // esto retorna la pagina que deseo ver
	}
	// Ejemplo desde la url: http://localhost:8080/params/string?textoUrl=Soy javier augusto
	// valor por defecto: http://localhost:8080/params/string?textoUrl=   => mostraria el texto valor por defecto
	
	
	//Metodo para recibir y enviar parametro
	@GetMapping("/mix-params")
	public String param(@RequestParam(name ="saludoUrl") String saludo, @RequestParam(name = "numeroUrl") Integer numero, Model model) {
		model.addAttribute("resultado", "El saludo enviado es:" + saludo + " 'y el numero es: '" + numero + "'");
		return "params/ver";
	}
	
	@GetMapping("/mix-params-request")
	public String paramRequest(HttpServletRequest request, Model model) {
		String saludo = request.getParameter("saludoUrlReq");  // request captura un string
		Integer numero = null;
		try {
			 numero = Integer.parseInt(request.getParameter("numeroUrlReq")); // como captura una cadena se pasa a entero
		}catch(NumberFormatException e) { // este try catch controla en dado cosa de que no sea numerico el parametro numeroUrl
			numero = 0;
		}
		model.addAttribute("resultado", "El saludo enviado con httrequest es: " + saludo + " - el numero es:" + numero);
		return "params/ver";
	}
}