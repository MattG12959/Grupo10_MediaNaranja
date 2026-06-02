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
public class TarjetaCredito {

    private String numero;
    private String titular;
    private Date fechaExpiracion;
    private String banco;
    private int codigoSeguridad;

    // Constructor
    public TarjetaCredito(String numero, String titular, Date fechaExpiracion,
                           String banco, int codigoSeguridad) {

        this.numero = numero;
        this.titular = titular;
        this.fechaExpiracion = fechaExpiracion;
        this.banco = banco;
        this.codigoSeguridad = codigoSeguridad;
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    // Métodos
    public boolean validarTarjeta() {

        if (numero != null && numero.length() >= 12) {
            return true;
        }

        return false;
    }

    public void generarCobro(double monto) {

        System.out.println("Cobro generado por $" + monto);
    }


    public boolean realizarPago(Pago pago) { 

        if (validarTarjeta()) {
            System.out.println("Pago realizado con éxito.");


            System.out.println("Monto: $" + pago.getMonto());

            return true; 
        } else {
            System.out.println("Tarjeta inválida.");
            return false; 
        }
    }
}
