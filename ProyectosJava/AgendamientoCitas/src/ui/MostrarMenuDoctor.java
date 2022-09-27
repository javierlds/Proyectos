package ui;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MostrarMenuDoctor {

    public static ArrayList<Doctor> doctoresCitasDisponibles = new ArrayList<>();   // arreglo de doctores con citas disponibles en su agenda
    public static void muestraMenu(){
        int respuesta = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido " + UIMenu.doctorLogueado.getNombre() + " " + UIMenu.doctorLogueado.getApellido()+ "\n" +
                    "1. Adicionar cita"+ "\n" +
                    "2. Mis citas programadas"+ "\n" +
                    "3. Salir del sistema"+ "\n");
            Scanner scan = new Scanner(System.in);
            respuesta = Integer.valueOf(scan.nextLine());
            switch(respuesta){
                case 1:
                    adicionarCita();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.mostrarMenu();
                    break;

            }
        }while(respuesta !=0);
    }

    private static void adicionarCita(){
        int respuesta = 0;
        do{
            System.out.println();
            System.out.println(" Adicionar cita");
            System.out.println(" Seleccione un mes");
            for(int i = 0; i < 12; i++){  // se recorreran los 12 meses del año
                int j = i + 1;
                System.out.println(j + "." + UIMenu.MESES[i]);
            }
            System.out.println("0. Retornar");
            Scanner scan = new Scanner(System.in);
            respuesta = Integer.valueOf(scan.nextLine());
            if(respuesta > 0 && respuesta < 12){
                int mesSeleccionado = respuesta;
                System.out.println(mesSeleccionado + "." + UIMenu.MESES[mesSeleccionado]);
                System.out.println(" Inserte fecha disponible: [dd/mm/yyyy]");
                String fecha = scan.nextLine();
                System.out.println("Tu fecha es: " + fecha + "\n 1. Correcto \n 2. Cambiar fecha");
                int respuestaFecha = Integer.valueOf(scan.nextLine());

                if(respuestaFecha == 2) continue; // No se sale del ciclo evita la siguiente linea y queda donde se quedo
                int respuestaTiempo = 0;
                String hora = "";
                do{
                    System.out.println("Inserte la hora disponible para la fecha " +  fecha + "[16:00]");
                    hora = scan.nextLine();
                    System.out.println("Tu hora es: " + hora + "\n 1. Correcto \n 2. Cambiar fecha");
                    respuestaTiempo = Integer.valueOf(scan.nextLine());
                }while(respuestaTiempo == 2);
                UIMenu.doctorLogueado.adicionarCita(fecha,hora);
                verificarCitasDisponiblesDoctor(UIMenu.doctorLogueado);

            }else if(respuesta == 0){
                muestraMenu();
            }
        }while(respuesta != 0);
    }

    private static void verificarCitasDisponiblesDoctor(Doctor doctor) { // solo la logica le corresponde a esta clase
        if(doctor.getCitasHabilitadas().size()>0 && !doctoresCitasDisponibles.contains(doctor)){  // si tiene citas
            doctoresCitasDisponibles.add(doctor);
        }
    }
}