package modelo;

import enums.TipoPlace;

/**
 *
 * @author Nehuen
 */
public class Place {
    
    private String nombre;
    private TipoPlace tipoLugar;

    // Constructor
    public Place(String nombre, TipoPlace tipoLugar) {
        this.nombre = nombre;
        this.tipoLugar = tipoLugar;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPlace getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(TipoPlace tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    // Métodos
    public void verLugares() {
        System.out.println("Lugar: " + nombre);
        System.out.println("Tipo: " + tipoLugar);
    }

    public void mostrarLugar() {
        System.out.println(nombre + " - " + tipoLugar);
    }
    
}
