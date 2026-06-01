/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo20;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ema
 */
public class Meeting {
    
    Date fechaDeMeeting;
    String detalle;
    int puntosObtenidos;
    int valoracion;
    Places lugarDeLaCita;
    ArrayList<Places> Lugares;
    Feedback feedbackDeMeeting; // hay varios feedback, este es de meting, puede ser tambien de match,etc
    
    //constructor, se crea despues del meting
    public Meeting(Date fechaDeMeeting, String detalle, int puntosObtenidos, int valoracion, Places Lugar) {
        this.fechaDeMeeting = fechaDeMeeting;
        this.detalle = detalle;
        this.puntosObtenidos = puntosObtenidos;
        this.valoracion = valoracion;
        this.lugarDeLaCita = Lugar;
    }
    
    //
    void verLugares(){
                System.out.println("Listar Lugares");
        int i=0;
        for (Places Lugar : Lugares) {
            System.out.println("lugar " +i+" "+ Lugar);
            i++;
        }
    }
    void mostrarLugar(){
        System.out.println("Lugar de la cita:"+ lugarDeLaCita);
    } 
    void feedback(){}
    
}

