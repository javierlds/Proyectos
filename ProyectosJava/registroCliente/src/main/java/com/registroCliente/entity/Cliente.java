package com.registroCliente.entity;


import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombre1")
    private String nombre1;

    @Column(name = "nombre2")
    private String nombre2;

    @Column(name = "apellido1")
    private String apellido1;

    @Column(name = "apellido2")
    private String apellido2;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private Long telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "usuario_crea")
    private String usuarioCrea;

    @Column(name = "fecha_crea")
    private Date fechaCrea;

    @Column(name = "usuario_modifica")
    private String usuarioModifica;

    @Column(name = "fecha_modifica")
    private Date fechaModifica;

    @Column(name = "id_ciudad_nacimiento")
    private Long idCiudadNacimiento;

    @Column(name = "id_tipo_identificacion")
    private Long idTipoIdentificacion;

}
