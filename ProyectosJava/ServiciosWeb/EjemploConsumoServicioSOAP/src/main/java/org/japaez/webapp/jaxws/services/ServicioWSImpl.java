package org.japaez.webapp.jaxws.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.japaez.webapp.jaxws.models.Curso;

import java.util.Arrays;
import java.util.List;

@WebService(endpointInterface = "org.japaez.webapp.jaxws.services.ServicioWSImpl")// para solo publicar los metodos de la interfaz, si se deja sin endpoint mostrariatodo
// Esto asegura solo publica los metodos de la interfaz y no todos los metodos que se tengan
public class ServicioWSImpl implements SerivicioWS{
    private int contador;


    @Override
    @WebMethod  // va a ser metodo del servicio web
    public String saludar(String persona) {
        System.out.println("Imprimiento dentro del servicio web con instancia: " + this);
        contador++;
        System.out.println("Valor del contador en metodo saludar es: " + contador);
        return "Hola que tal " +  persona;
    }

    @Override
    @WebMethod // va a ser metodo del servicio web
    public List<Curso> listar() {
        return Arrays.asList(new Curso("Java"), new Curso("spring"), new Curso("jakarta ee"));
    }

    @Override
    @WebMethod // va a ser metodo del servicio web
    public Curso crear(Curso curso) {
        System.out.println("Curso guarado con exito .. "+ curso);
        Curso nuevoCurso = new Curso();
        nuevoCurso.setNombre(curso.getNombre());
        return nuevoCurso;
    }
}
