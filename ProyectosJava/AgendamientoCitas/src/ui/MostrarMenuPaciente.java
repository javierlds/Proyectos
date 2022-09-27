package ui;

import modelo.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostrarMenuPaciente {

    public static void mostrarMenu(){
        int respuesta = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Paciente:");
            System.out.println("Bienvenido " + UIMenu.pacienteLoqueado.getNombre() + " " + UIMenu.pacienteLoqueado.getApellido()+ "\n" +
                    "1. Reservar una cita"+ "\n" +
                    "2. Mis citas programadas"+ "\n" +
                    "0. Salir del sistema"+ "\n");
            Scanner scan = new Scanner(System.in);
            respuesta = Integer.valueOf(scan.nextLine());
            switch(respuesta){
                case 1:
                    mostrarReservaCita();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.mostrarMenu();
                    break;

            }
        }while(respuesta !=0);
    }

    private static void mostrarReservaCita(){
        int respuesta = 0;
        do{
            System.out.println("Mostrar listado de citas disponibles");
            //Colleccion de objetos
            //integer => llevara la numeracion de fechas
            //2 integer indice de la fecha seleccionada
            //[doctors]
            //1.- doctor1
                // 1 - fecha1
                // 2 - fecha2
            //2.- doctor 2
            //3.- doctor 3
            // el primer indice lleva la numeracion de doctores
            // el map interno lleva la numeracion de las fechas que hay por cada doctor.
            Map<Integer, Map<Integer, Doctor>>doctores = new TreeMap<>();
            int k = 0;
            for(int i = 0; i < MostrarMenuDoctor.doctoresCitasDisponibles.size(); i++){ //
                ArrayList<Doctor.CitasHabilitadas> citasHabil = MostrarMenuDoctor.doctoresCitasDisponibles.get(i).getCitasHabilitadas();//capturando unicamente las citas, se accede a clase estatica anidada
                // recorre doctor y se le piden las fechas disponibles.
                Map<Integer, Doctor> doctorHabilitado = new TreeMap<>(); // Tree map da una estructura de arbol
                for(int j = 0; j < citasHabil.size(); j++){  //aca se despliegan las listas de todos los doctores
                    k++;
                    System.out.println(k + ". " + citasHabil.get(j).getDate());
                    doctorHabilitado.put(Integer.valueOf(j),MostrarMenuDoctor.doctoresCitasDisponibles.get(i)); // se crea nueva estructura de datos que ayuda a manipula la salida
                    doctores.put(Integer.valueOf(k),doctorHabilitado);  // aca se forma la numeracion 1. Doctor1
                }
            }
            int respuestaSeleccionada = 0;
            Scanner scan = new Scanner(System.in);
            respuestaSeleccionada = Integer.valueOf(scan.nextLine());
            Map<Integer, Doctor>doctorHabilitado = doctores.get(respuestaSeleccionada);
            Integer indexDate =0;
            Doctor doctorSeleccionado = new Doctor();
            for(Map.Entry<Integer,Doctor> doc: doctorHabilitado.entrySet()){
                indexDate = doc.getKey();
                doctorSeleccionado = doc.getValue();
            }
            System.out.println(doctorSeleccionado.getNombre() +
                    ". Fecha: " + doctorSeleccionado.getCitasHabilitadas().get(indexDate).getDate()+
                    ". Hora: " + doctorSeleccionado.getCitasHabilitadas().get(indexDate).getTime());
            System.out.println("Confirma tu cita: \n 1. Yes \n2. Cambiar fecha"  );
            respuestaSeleccionada = Integer.valueOf(scan.nextLine());
            if(respuestaSeleccionada == 1){


            }


        }while(respuesta!= 0);
    }
}
