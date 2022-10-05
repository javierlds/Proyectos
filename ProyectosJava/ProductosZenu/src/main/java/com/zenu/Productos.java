/*
* Clase con la definicion de los atributos de la tabla PRODUCTOS
* */
package com.zenu;


public class Productos {

    private int codigo;
    private String nombre;
    private String descripcion;
    private int porciones;
    private float peso;
    private int id_unidad_peso;
    private String preparacion;
    private float precio;
    private float precio_gramo;
    private int id_dom_consumo;
    private int id_marca;
    private int id_tipo_producto;

    public Productos(){

    }

    public Productos(int codigo, String nombre, String descripcion, int porciones, float peso, int id_unidad_peso, String preparacion, float precio, float precio_gramo, int id_dom_consumo, int id_marca, int id_tipo_producto, int id_producto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porciones = porciones;
        this.peso = peso;
        this.id_unidad_peso = id_unidad_peso;
        this.preparacion = preparacion;
        this.precio = precio;
        this.precio_gramo = precio_gramo;
        this.id_dom_consumo = id_dom_consumo;
        this.id_marca = id_marca;
        this.id_tipo_producto = id_tipo_producto;
        this.id_producto = id_producto;
    }

    private int id_producto;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorciones() {
        return porciones;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getId_unidad_peso() {
        return id_unidad_peso;
    }

    public void setId_unidad_peso(int id_unidad_peso) {
        this.id_unidad_peso = id_unidad_peso;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio_gramo() {
        return precio_gramo;
    }

    public void setPrecio_gramo(float precio_gramo) {
        this.precio_gramo = precio_gramo;
    }

    public int getId_dom_consumo() {
        return id_dom_consumo;
    }

    public void setId_dom_consumo(int id_dom_consumo) {
        this.id_dom_consumo = id_dom_consumo;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }




}
