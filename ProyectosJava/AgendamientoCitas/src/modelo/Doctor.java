/**
 *
 * Encapsulamiento:
 *     permite controlar el acceso a los atributos y metodos de la clase. Solo se puede modificar desde la misma clase
 *     para el acceso se usan los metodos getter(retornar valor del atributo) y setters(establecer un valor para el atributo).
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Persona{
    // encapsulamiento

    private String especialidad;
    private String numeroRegistro;
    public ArrayList<CitasHabilitadas> citasHabilitadas = new ArrayList<>();// coleccion de objetos, dentro de <> va el tipo en este caso es el de la clase anidada.

    //constructor
    // public Doctor(String name){       // los diferentes constructores me permite sobrecarga
    //  System.out.println("Nombre del doctor es: " + name);
    // }
    public Doctor(String nombre, String apellido, int edad, char genero, String email, String direccion, String numeroTelefono, String especialidad){
        super(nombre, apellido, edad, genero, email, direccion, numeroTelefono);  // Indica que una variable o un metodo es de la clase padre(SUPERCLASE) / esto permite saber que, ya los atributos de la super clase estan inicializados.
        this.especialidad = especialidad;  // this -> hace referencia a los elementos de la clase
    }
    public Doctor(){
        super();
    }



    //metodo que carga un arreglo de objetos con citas asociadas del doctor.
    public void adicionarCita(String date, String time){
        citasHabilitadas.add(new CitasHabilitadas(date, time)); // metodo que va a estar añadiendo nuevas citas, que se acumularan en el array
    }

    // metodo que retorna un arreglo de citas lleno.
    public ArrayList<CitasHabilitadas> getCitasHabilitadas(){
        return citasHabilitadas;
    }

    @Override
    public String toString(){
        return super.toString() + "\n especialidad: " + this.especialidad + "\n AVAILABLE:" + citasHabilitadas.toString(); // Reutiliza el metodo toString de la clase padre.
    }

    @Override
    public void mostrarDatosPersona() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    public String getespecialidad(){
        return especialidad;
    }

    public void setespecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public String getnumeroRegistro(){
        return this.numeroRegistro;
    }

    public void setnumeroRegistro(String numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }

    public static class CitasHabilitadas{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Para formatos de fecha

        public CitasHabilitadas(String date, String time){
            try{
                this.date = format.parse(date);  // lo transforma en fecha
            }catch(ParseException e){
                e.printStackTrace();;
            }
            this.time = time;
        }

        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }

        public Date getDate(String date){
            return this.date;
        }

        public String getDate(){
            return format.format(this.date);
        }

        public void setDate(Date date){
            this.date = date;
        }

        public String getTime(){
            return this.time;
        }

        public void setTime(String time){
            this.time = time;
        }

        @Override
        public String toString(){
            return "Available appointments \nDate: " + date + "\nTime:" + time;  // salto de linea.
        }


    }
}