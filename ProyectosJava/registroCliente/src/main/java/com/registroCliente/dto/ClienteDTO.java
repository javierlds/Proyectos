package com.registroCliente.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ClienteDTO {

    private Integer id;
    private String identificacion;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;
    private String email;
    private Date fechaNacimiento;
    private String usuarioCrea;
    private Date fechaCrea;
    private String usuarioModifica;
    private Date fechaModifica;

}
