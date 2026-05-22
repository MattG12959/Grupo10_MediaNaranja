/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;

/**
 *
 * @author Nehuen
 */
public class Feedback {
    private String comentario;
    private boolean positivo;
    private Date fechaFeedback;

    // Constructor
    public Feedback(String comentario, boolean positivo, Date fechaFeedback) {
        this.comentario = comentario;
        this.positivo = positivo;
        this.fechaFeedback = fechaFeedback;
    }

    // Getters y Setters
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }

    public Date getFechaFeedback() {
        return fechaFeedback;
    }

    public void setFechaFeedback(Date fechaFeedback) {
        this.fechaFeedback = fechaFeedback;
    }

    // Métodos
    public void enviarFeedback() {
        System.out.println("Feedback enviado correctamente.");
    }

    public void modificarFeedback(String nuevoComentario, boolean nuevoEstado) {

        this.comentario = nuevoComentario;
        this.positivo = nuevoEstado;

        System.out.println("Feedback modificado.");
    }
}
