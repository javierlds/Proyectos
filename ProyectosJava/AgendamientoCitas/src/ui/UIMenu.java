package ui;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MESES = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogueado;
    public static Paciente pacienteLoqueado;

    public static void mostrarMenu(){
        System.out.println("***** Bienvenido a MIASIGNADOR DE CITAS ****");
        System.out.println("Seleccione la opcion deseada:");

        int respuesta = 0;
        do{
            System.out.println("1. Menu doctor");
            System.out.println("2. Menu enfermera");
            System.out.println("0. Salir");

            Scanner scan = new Scanner(System.in);
            respuesta = Integer.valueOf(scan.nextLine());

            switch(respuesta){
                case 1:
                    autenticaUsuario(respuesta);
                    respuesta = 0;
                    break;
                case 2:
                    autenticaUsuario(respuesta);
                    respuesta = 0;
                    break;
                default:
                    System.out.println("Debe seleccionar una opcion correcta.");
            }

        }while(respuesta !=0);
    }

    public static void autenticaUsuario(int tipoUsuario){
        //tipo usuario = 1 Doctor
        //tipo usuario = 2 paciente

        ArrayList<Doctor> doctores = new ArrayList<>();  // esto simula una fuente de datos, despues hacerlo con Bases de datos
        doctores.add(new Doctor("Javier", "Paez",34,'M', "javierlds@gmail.com","Cra 5a N 98 78", "3202269666","Otorrino"));
        doctores.add(new Doctor("Andrea", "Guerra",30,'F', "andrea12@gmail.com","Cll 8 9 74", "3108482622","Psicologa"));
        doctores.add(new Doctor("Pilar", "Soler",28,'F', "solerPil@gmail.com","Dg 5A 89 88", "3145968741","Deportologa"));

        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes.add(new Paciente("Jose","Paez",56,'M',"jose@gmail.com", "Cra 5 9 63","3202269666","21/03/1988",86,175, "A+"));
        pacientes.add(new Paciente("Isabel","Castro",40,'F',"iscastro@gmail.com", "Cll 9 6 59","3153181057","04/03/1988",86,165, "A+"));
        pacientes.add(new Paciente("Angela","Casallas",28,'F',"angCas@gmail.com", "Kra 58 96","3214589687","14/08/1988",62,175, "A+"));

        boolean validaCorreo = false;
        do{  // Inicia la validacion de correo
            System.out.println("Ingresa tu email:");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(tipoUsuario == 1){   // en esta seccion validamos si el tipo de usuario es doctor para recorrer el arreglo y econtrar si esta o no registrado
                for(Doctor d: doctores){
                    if(d.getEmail().equals(email)){  // valida el mail registrado vs el mail que ingrese
                        validaCorreo = true;
                        doctorLogueado = d;
                        MostrarMenuDoctor.muestraMenu();
                    }
                }
            }else{
                for(Paciente p: pacientes){
                    if(p.getEmail().equals(email)){  // valida el mail registrado vs el mail que ingrese
                        validaCorreo = true;
                        pacienteLoqueado = p;
                        MostrarMenuPaciente().;

                    }
                }
            }
        }while(!validaCorreo);
    }
}
