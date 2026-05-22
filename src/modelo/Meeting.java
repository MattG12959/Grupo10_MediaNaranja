/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enums.TipoFeedback;
import java.util.Date;
/**
 *
 * @author Nehuen
 */
public class Meeting {
    private Date fecha;
    private String detalle;
    private int pointsEarned;
    private TipoFeedback tipoFeedback;
    private Place lugar;

    // Constructor
    public Meeting(Date fecha, String detalle, TipoFeedback tipoFeedback, Place lugar) {
        this.fecha = fecha;
        this.detalle = detalle;
        this.tipoFeedback = tipoFeedback;
        this.lugar = lugar;

        calcularPoints();
    }

    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public TipoFeedback getTipoFeedback() {
        return tipoFeedback;
    }

    public void setTipoFeedback(TipoFeedback tipoFeedback) {
        this.tipoFeedback = tipoFeedback;
    }

    public Place getLugar() {
        return lugar;
    }

    public void setLugar(Place lugar) {
        this.lugar = lugar;
    }

    // Métodos
    public void calcularPoints() {

        switch (tipoFeedback) {

            case LIKE:
                pointsEarned = 20;
                break;

            case REGULAR:
                pointsEarned = 10;
                break;

            case DISLIKE:
                pointsEarned = 0;
                break;
        }
    }

    public void registrarFeedback(TipoFeedback feedback) {
        this.tipoFeedback = feedback;
        calcularPoints();
    }

    public void mostrarDetalle() {

        System.out.println("Fecha: " + fecha);
        System.out.println("Detalle: " + detalle);
        System.out.println("Feedback: " + tipoFeedback);
        System.out.println("Puntos: " + pointsEarned);

        if (lugar != null) {
            lugar.mostrarLugar();
        }
    }
    
}
