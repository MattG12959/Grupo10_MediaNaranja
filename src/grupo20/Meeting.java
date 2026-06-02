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
        this.Lugares = new ArrayList<>();
    }
    
    //
    public void verLugares(){
        System.out.println("Listar Lugares");
        int i=0;
        for (Places Lugar : Lugares) {
            System.out.println("lugar " +i+" "+ Lugar);
            i++;
        }
    }
    public void mostrarLugar(){
        System.out.println("Lugar de la cita:"+ lugarDeLaCita);
    }
    
    public void agregarFeedback(Feedback feedback) {
        this.feedbackDeMeeting = feedback;
    }
    
    public void verFeedback() {
        System.out.println("Feedback del Meeting:");
        System.out.println(feedbackDeMeeting);
    }
    
    public Date getFechaDeMeeting() {
        return fechaDeMeeting;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public int getValoracion() {
        return valoracion;
    }

    public Places getLugarDeLaCita() {
        return lugarDeLaCita;
    }

    // Setters

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "fecha=" + fechaDeMeeting +
                ", detalle='" + detalle + '\'' +
                ", puntos=" + puntosObtenidos +
                ", valoracion=" + valoracion +
                ", lugar=" + lugarDeLaCita +
                '}';
    }
}


