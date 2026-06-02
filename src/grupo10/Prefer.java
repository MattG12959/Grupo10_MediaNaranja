/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo10;

import enums.EstadoCivil;
import enums.Nivel;
import java.util.Date;

/**
 *
 * @author Antonacci Matías, Dave Natalia, Zerdán Nehuen
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
    private Nivel nivelCarinioDeseado;
    private Nivel nivelAlegriaDeseado;
    private Nivel nivelCompanierismoDeseado;
    private Nivel nivelSalidorDeseado;
    private String aficionesDeseadas;
    private int prioridadEstadoCivil;
    private int prioridadEdad;
    private int prioridadHijos;
    private int prioridadNivelCultural;
    private int prioridadEstatura;
    private int prioridadPeso;
    private int prioridadPelo;
    private int prioridadOjos;
    private int prioridadCarinio;
    private int prioridadAlegria;
    private int prioridadCompanierismo;
    private int prioridadSalidor;
    private Date fechaCreacion;
    private boolean activa;

    public Prefer(EstadoCivil estadoCivilDeseado, int edadMinima, int edadMaxima, boolean aceptaHijos, Nivel nivelCulturalDeseado, double estaturaMin, double estaturaMax, double pesoMin, double pesoMax, String colorPeloDeseado, String colorOjosDeseado, Nivel nivelCarinioDeseado, Nivel nivelAlegriaDeseado, Nivel nivelCompanierismoDeseado, Nivel nivelSalidorDeseado, String aficionesDeseadas, int prioridadEstadoCivil, int prioridadEdad, int prioridadHijos, int prioridadNivelCultural, int prioridadEstatura, int prioridadPeso, int prioridadPelo, int prioridadOjos, int prioridadCarinio, int prioridadAlegria, int prioridadCompanierismo, int prioridadSalidor, Date fechaCreacion, boolean activa) {
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
        this.nivelCarinioDeseado = nivelCarinioDeseado;
        this.nivelAlegriaDeseado = nivelAlegriaDeseado;
        this.nivelCompanierismoDeseado = nivelCompanierismoDeseado;
        this.nivelSalidorDeseado = nivelSalidorDeseado;
        this.aficionesDeseadas = aficionesDeseadas;
        this.prioridadEstadoCivil = prioridadEstadoCivil;
        this.prioridadEdad = prioridadEdad;
        this.prioridadHijos = prioridadHijos;
        this.prioridadNivelCultural = prioridadNivelCultural;
        this.prioridadEstatura = prioridadEstatura;
        this.prioridadPeso = prioridadPeso;
        this.prioridadPelo = prioridadPelo;
        this.prioridadOjos = prioridadOjos;
        this.prioridadCarinio = prioridadCarinio;
        this.prioridadAlegria = prioridadAlegria;
        this.prioridadCompanierismo = prioridadCompanierismo;
        this.prioridadSalidor = prioridadSalidor;
        this.fechaCreacion = fechaCreacion;
        this.activa = activa;
    }
    
    

    public Prefer() {
        this.fechaCreacion = new Date();
        this.activa = true;
    }

    // Getters y Setters
    public EstadoCivil getEstadoCivilDeseado() {
        return estadoCivilDeseado;
    }

    public void setEstadoCivilDeseado(EstadoCivil estadoCivilDeseado) {
        this.estadoCivilDeseado = estadoCivilDeseado;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public boolean isAceptaHijos() {
        return aceptaHijos;
    }

    public void setAceptaHijos(boolean aceptaHijos) {
        this.aceptaHijos = aceptaHijos;
    }

    public Nivel getNivelCulturalDeseado() {
        return nivelCulturalDeseado;
    }

    public void setNivelCulturalDeseado(Nivel nivelCulturalDeseado) {
        this.nivelCulturalDeseado = nivelCulturalDeseado;
    }

    public double getEstaturaMin() {
        return estaturaMin;
    }

    public void setEstaturaMin(double estaturaMin) {
        this.estaturaMin = estaturaMin;
    }

    public double getEstaturaMax() {
        return estaturaMax;
    }

    public void setEstaturaMax(double estaturaMax) {
        this.estaturaMax = estaturaMax;
    }

    public double getPesoMin() {
        return pesoMin;
    }

    public void setPesoMin(double pesoMin) {
        this.pesoMin = pesoMin;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }

    public String getColorPeloDeseado() {
        return colorPeloDeseado;
    }

    public void setColorPeloDeseado(String colorPeloDeseado) {
        this.colorPeloDeseado = colorPeloDeseado;
    }

    public String getColorOjosDeseado() {
        return colorOjosDeseado;
    }

    public void setColorOjosDeseado(String colorOjosDeseado) {
        this.colorOjosDeseado = colorOjosDeseado;
    }

    public Nivel getNivelCarinioDeseado() {
        return nivelCarinioDeseado;
    }

    public void setNivelCarinioDeseado(Nivel nivelCarinioDeseado) {
        this.nivelCarinioDeseado = nivelCarinioDeseado;
    }

    public Nivel getNivelAlegriaDeseado() {
        return nivelAlegriaDeseado;
    }

    public void setNivelAlegriaDeseado(Nivel nivelAlegriaDeseado) {
        this.nivelAlegriaDeseado = nivelAlegriaDeseado;
    }

    public Nivel getNivelCompanierismoDeseado() {
        return nivelCompanierismoDeseado;
    }

    public void setNivelCompanierismoDeseado(Nivel nivelCompanierismoDeseado) {
        this.nivelCompanierismoDeseado = nivelCompanierismoDeseado;
    }

    public Nivel getNivelSalidorDeseado() {
        return nivelSalidorDeseado;
    }

    public void setNivelSalidorDeseado(Nivel nivelSalidorDeseado) {
        this.nivelSalidorDeseado = nivelSalidorDeseado;
    }

    public String getAficionesDeseadas() {
        return aficionesDeseadas;
    }

    public void setAficionesDeseadas(String aficionesDeseadas) {
        this.aficionesDeseadas = aficionesDeseadas;
    }

    public int getPrioridadEstadoCivil() {
        return prioridadEstadoCivil;
    }

    public void setPrioridadEstadoCivil(int prioridadEstadoCivil) {
        this.prioridadEstadoCivil = prioridadEstadoCivil;
    }

    public int getPrioridadEdad() {
        return prioridadEdad;
    }

    public void setPrioridadEdad(int prioridadEdad) {
        this.prioridadEdad = prioridadEdad;
    }

    public int getPrioridadHijos() {
        return prioridadHijos;
    }

    public void setPrioridadHijos(int prioridadHijos) {
        this.prioridadHijos = prioridadHijos;
    }

    public int getPrioridadNivelCultural() {
        return prioridadNivelCultural;
    }

    public void setPrioridadNivelCultural(int prioridadNivelCultural) {
        this.prioridadNivelCultural = prioridadNivelCultural;
    }

    public int getPrioridadEstatura() {
        return prioridadEstatura;
    }

    public void setPrioridadEstatura(int prioridadEstatura) {
        this.prioridadEstatura = prioridadEstatura;
    }

    public int getPrioridadPeso() {
        return prioridadPeso;
    }

    public void setPrioridadPeso(int prioridadPeso) {
        this.prioridadPeso = prioridadPeso;
    }

    public int getPrioridadPelo() {
        return prioridadPelo;
    }

    public void setPrioridadPelo(int prioridadPelo) {
        this.prioridadPelo = prioridadPelo;
    }

    public int getPrioridadOjos() {
        return prioridadOjos;
    }

    public void setPrioridadOjos(int prioridadOjos) {
        this.prioridadOjos = prioridadOjos;
    }

    public int getPrioridadCarinio() {
        return prioridadCarinio;
    }

    public void setPrioridadCarinio(int prioridadCarinio) {
        this.prioridadCarinio = prioridadCarinio;
    }

    public int getPrioridadAlegria() {
        return prioridadAlegria;
    }

    public void setPrioridadAlegria(int prioridadAlegria) {
        this.prioridadAlegria = prioridadAlegria;
    }

    public int getPrioridadCompanierismo() {
        return prioridadCompanierismo;
    }

    public void setPrioridadCompanierismo(int prioridadCompanierismo) {
        this.prioridadCompanierismo = prioridadCompanierismo;
    }

    public int getPrioridadSalidor() {
        return prioridadSalidor;
    }

    public void setPrioridadSalidor(int prioridadSalidor) {
        this.prioridadSalidor = prioridadSalidor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    //Métodos
    public void modificarPreferencias() {
        System.out.println("Preferencias modificadas");
    }

    public void activarPreferencia() {
        activa = true;
    }

    public void desactivarPreferencia() {
        activa = false;
    }

    public int calcularAfinidad(Profile profile, Single single) {
        int puntos = 0;

        if (single.getEdad() >= edadMinima && single.getEdad() <= edadMaxima) {
            puntos += prioridadEdad;
        }
        if (single.getEstadoCivil() == estadoCivilDeseado) {
            puntos += prioridadEstadoCivil;
        }
        if (aceptaHijos == single.isTieneHijos()) {
            puntos += prioridadHijos;
        }
        if (profile != null && profile.getNivelCultural() == nivelCulturalDeseado) {
            puntos += prioridadNivelCultural;
        }
        if (profile != null && profile.getEstatura() >= estaturaMin
                && profile.getEstatura() <= estaturaMax) {
            puntos += prioridadEstatura;
        }
        if (profile != null && profile.getPeso() >= pesoMin
                && profile.getPeso() <= pesoMax) {
            puntos += prioridadPeso;
        }

        return puntos;
    }

}
