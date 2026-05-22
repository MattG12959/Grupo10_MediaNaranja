/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enums.EstadoCivil;
import enums.EstadoSingle;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Nehuen
 */
public class Single {
    private String dni;
    private String nombreCompleto;
    private String direccion;
    private String localidad;
    private String email;

    private EstadoCivil estadoCivil;

    private int edad;

    private String sexo;

    private boolean tieneHijos;

    private Single crush;

    private String usuario;
    private String contraseña;

    private String foto;

    private EstadoSingle estado;

    private Date fechaInscripcion;

    private boolean matched;

    // Relaciones
    private Profile profile;

    private Prefer preferActual;

    private ArrayList<Prefer> historialPreferencias;

    private ArrayList<StoryMatch> historialMatches;

    private TarjetaCredito tarjetaCredito;

    // Constructor
    public Single(String dni,
                  String nombreCompleto,
                  String direccion,
                  String localidad,
                  String email,
                  EstadoCivil estadoCivil,
                  int edad,
                  String sexo,
                  boolean tieneHijos,
                  String usuario,
                  String contraseña,
                  String foto,
                  Profile profile,
                  Prefer preferActual,
                  TarjetaCredito tarjetaCredito) {

        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.localidad = localidad;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.sexo = sexo;
        this.tieneHijos = tieneHijos;

        this.usuario = usuario;
        this.contraseña = contraseña;
        this.foto = foto;

        this.profile = profile;
        this.preferActual = preferActual;
        this.tarjetaCredito = tarjetaCredito;

        this.estado = EstadoSingle.SINGLE;

        this.fechaInscripcion = new Date();

        this.matched = false;

        this.historialPreferencias = new ArrayList<>();

        this.historialMatches = new ArrayList<>();
    }

    // Métodos
    public void registrarse() {

        System.out.println(nombreCompleto + " registrado correctamente.");
    }

    public boolean iniciarSesion(String user, String pass) {

        return usuario.equals(user) &&
               contraseña.equals(pass);
    }

    public void modificarDatos(String direccion, String localidad) {

        this.direccion = direccion;
        this.localidad = localidad;

        System.out.println("Datos modificados.");
    }

    public void modificarPerfil(Profile nuevoPerfil) {

        this.profile = nuevoPerfil;

        System.out.println("Perfil actualizado.");
    }

    public void modificarPreferencias(Prefer nuevaPreferencia) {

        historialPreferencias.add(preferActual);

        this.preferActual = nuevaPreferencia;

        System.out.println("Preferencias actualizadas.");
    }

    public void darBajaCrush() {

        crush = null;

        matched = false;

        estado = EstadoSingle.SINGLE;

        System.out.println("Crush eliminado.");
    }

    public void darseDeBaja() {

        estado = EstadoSingle.INACTIVO;

        System.out.println("Usuario dado de baja.");
    }

    public double calcularCuotaMensual() {

        if (crush != null) {

            return 11999 * 0.25;
        }

        return 11999;
    }

    public void pagarMensualidad() {

        double monto = calcularCuotaMensual();

        tarjetaCredito.realizarPago(monto);
    }

    public void agregarStoryMatch(StoryMatch match) {

        historialMatches.add(match);
    }

    public void recibirMail(String mensaje) {

        System.out.println("Mail recibido:");
        System.out.println(mensaje);
    }

    public boolean tieneCrush() {

        return crush != null;
    }

    // Getters importantes
    public int getEdad() {
        return edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public Profile getProfile() {
        return profile;
    }

    public Prefer getPreferActual() {
        return preferActual;
    }

    public ArrayList<StoryMatch> getHistorialMatches() {
        return historialMatches;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    // Setter importante
    public void setCrush(Single crush) {

        this.crush = crush;

        this.matched = true;

        this.estado = EstadoSingle.MATCHED;
    }
}
