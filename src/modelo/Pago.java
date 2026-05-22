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
public class Pago {
    private int idPago;
    private double monto;
    private Date fechaPago;
    private String descripcion;
    private boolean pagado;

    // Constructor
    public Pago(int idPago, double monto, Date fechaPago, String descripcion) {

        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.descripcion = descripcion;
        this.pagado = false;
    }

    // Getters y Setters
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPagado() {
        return pagado;
    }

    // Métodos
    public void generarCargo() {

        System.out.println("Cargo generado:");
        System.out.println(descripcion + " - $" + monto);
    }

    public void cobrar() {

        pagado = true;

        System.out.println("Pago realizado correctamente.");
    }

    public void registrarPago() {

        if (pagado) {
            System.out.println("Pago registrado.");
        } else {
            System.out.println("El pago todavía no fue realizado.");
        }
    }
}
