/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enums.EstadoCivil;
import enums.Nivel;
import java.util.Date;
/**
 *
 * @author Nehuen
 */
public class Prefer {
    
    private EstadoCivil estadoCivilDeseado;

    private int edadMinima;
    private int edadMaxima;

    private boolean aceptaHijos;

    private Nivel nivelCulturalDeseado;

    private double estaturaMin;
    private double estaturaMax;

    private double pesoMin;
    private double pesoMax;

    private String colorPeloDeseado;
    private String colorOjosDeseado;

    private Nivel nivelCariñoDeseado;
    private Nivel nivelAlegriaDeseado;
    private Nivel nivelCompañerismoDeseado;
    private Nivel nivelSalidorDeseado;

    private String aficionesDeseadas;

    // Prioridades
    private int prioridadEstadoCivil;
    private int prioridadEdad;
    private int prioridadHijos;
    private int prioridadNivelCultural;
    private int prioridadEstatura;
    private int prioridadPeso;

    private Date fechaCreacion;
    private boolean activa;

    // Constructor
    public Prefer(EstadoCivil estadoCivilDeseado,
                  int edadMinima,
                  int edadMaxima,
                  boolean aceptaHijos,
                  Nivel nivelCulturalDeseado,
                  double estaturaMin,
                  double estaturaMax,
                  double pesoMin,
                  double pesoMax,
                  String colorPeloDeseado,
                  String colorOjosDeseado,
                  Nivel nivelCariñoDeseado,
                  Nivel nivelAlegriaDeseado,
                  Nivel nivelCompañerismoDeseado,
                  Nivel nivelSalidorDeseado,
                  String aficionesDeseadas) {

        this.estadoCivilDeseado = estadoCivilDeseado;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.aceptaHijos = aceptaHijos;
        this.nivelCulturalDeseado = nivelCulturalDeseado;
        this.estaturaMin = estaturaMin;
        this.estaturaMax = estaturaMax;
        this.pesoMin = pesoMin;
        this.pesoMax = pesoMax;
        this.colorPeloDeseado = colorPeloDeseado;
        this.colorOjosDeseado = colorOjosDeseado;
        this.nivelCariñoDeseado = nivelCariñoDeseado;
        this.nivelAlegriaDeseado = nivelAlegriaDeseado;
        this.nivelCompañerismoDeseado = nivelCompañerismoDeseado;
        this.nivelSalidorDeseado = nivelSalidorDeseado;
        this.aficionesDeseadas = aficionesDeseadas;

        this.fechaCreacion = new Date();
        this.activa = true;
    }

    // Métodos
    public void modificarPreferencias() {

        System.out.println("Preferencias modificadas.");
    }

    public void activarPreferencia() {

        activa = true;
    }

    public void desactivarPreferencia() {

        activa = false;
    }

    public int calcularAfinidad(Profile profile, Single single) {

        int puntos = 0;

        // Edad
        if (single.getEdad() >= edadMinima &&
            single.getEdad() <= edadMaxima) {

            puntos += prioridadEdad;
        }

        // Estado civil
        if (single.getEstadoCivil() == estadoCivilDeseado) {

            puntos += prioridadEstadoCivil;
        }

        // Hijos
        if (aceptaHijos == single.isTieneHijos()) {

            puntos += prioridadHijos;
        }

        // Nivel cultural
        if (profile.getNivelCultural() == nivelCulturalDeseado) {

            puntos += prioridadNivelCultural;
        }

        // Estatura
        if (profile.getEstatura() >= estaturaMin &&
            profile.getEstatura() <= estaturaMax) {

            puntos += prioridadEstatura;
        }

        // Peso
        if (profile.getPeso() >= pesoMin &&
            profile.getPeso() <= pesoMax) {

            puntos += prioridadPeso;
        }

        return puntos;
    }

    // Getters importantes
    public boolean isActiva() {
        return activa;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
}
