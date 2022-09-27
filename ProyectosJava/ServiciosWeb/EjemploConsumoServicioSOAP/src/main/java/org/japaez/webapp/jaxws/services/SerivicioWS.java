package org.japaez.webapp.jaxws.services;

import jakarta.jws.WebService;
import org.japaez.webapp.jaxws.models.Curso;

import java.util.List;

@WebService  // esta anotacion quiere decir que todos los metodos de la interfaz se expondran en el servicio web
public interface SerivicioWS {
    String saludar(String persona);
    List<Curso> listar();
    Curso crear(Curso curso);
}
