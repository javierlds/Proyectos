package modelo;

public class Enfermera extends Persona{

    private String especialidad;

    public Enfermera(String nombre, String apellido, int edad, char genero, String mail, String direccion, String numeroTelefono, String especialidad){
        super(nombre, apellido, edad, genero, mail, direccion, numeroTelefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatosPersona() {
        System.out.println("Empleado Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutricion, Cancerologia");
    }
}
