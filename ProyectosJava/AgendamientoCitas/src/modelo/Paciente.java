/**
 * Getter y Setters: ayudaran a tener la consistencia en nuestras variables de acuerdo a las reglas de negocio
 */

package modelo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Persona{

    // encapsulamiento de los atributos solo accedidos desde la misma clase
    private String cumpleaños;
    private double peso;
    private double altura;
    private String tipoSangre;

    private ArrayList<AgendarCitaDoctor> agendarCitaDoctor = new ArrayList<>();
    private ArrayList<AgendarCitaEnfermera> agendarCitaEnfermera = new ArrayList<>();

    public Paciente(String nombre, String apellido, int edad, char genero, String email, String direccion, String numeroTelefono,String cumpleaños, double peso, double altura, String tipoSangre){ // parametros minimos para que el paciente exista.
        super(nombre, apellido, edad, genero, email, direccion, numeroTelefono);  // Indica que una variable o un metodo es de la clase padre(SUPERCLASE)
        this.cumpleaños = cumpleaños;
        this.peso = peso;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
    }

    @Override //Sobreescritura de metodo to String de la clase Object
    public String toString(){
        return super.toString() +
                "\n CUMPLEAÑOS PACIENTE: " + this.cumpleaños+
                "\n PESO PACIENTE: " + this.peso +
                "\n ALTURA: " + this.altura +
                "\n TIPO SANGRE: " + this.tipoSangre;
    }

    @Override
    public void mostrarDatosPersona() {  // se da un comportamiento especial al metodo abstracto
        System.out.println( "Paciente.");
    }

    //metodos get y set ayudan a validar todo dato que se quiera asignar.
    // metodo get obtengo variable  -- metodo set asigno valor a la variable.
    public String getcumpleaños() {
        return this.cumpleaños;
    }

    public void setcumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;  // This => Permite especificar que la variable que esta señalando (this.nombreVariable) es de la misma clase en la que se usa.
    }

    public String getaltura() {
        return this.altura + "mts"; // se puede definir lo que yo retorne.
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public String gettipoSangre() {
        return this.tipoSangre;
    }

    public void settipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setpeso(double peso){
        this.peso = peso;
    }

    public String getpeso(){  //se establecen las reglas desde esta clase y metodo
        return this.peso + "kg.";
    }

    public ArrayList<AgendarCitaDoctor> getAgendarCitaDoctor() {
        return agendarCitaDoctor;
    }

    public void addAgendarCitaDoctor(Doctor doctor, Date fecha, String hora) {
        AgendarCitaDoctor agendaCitaDoc = new AgendarCitaDoctor(this, doctor);
    }

    public ArrayList<AgendarCitaEnfermera> getAgendarCitaEnfermera() {
        return agendarCitaEnfermera;
    }

    public void setAgendarCitaEnferemera(ArrayList<AgendarCitaEnfermera> agendarCitaEnfermera) {
        this.agendarCitaEnfermera = agendarCitaEnfermera;
    }
}