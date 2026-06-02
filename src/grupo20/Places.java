/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo20;

import java.util.ArrayList;

/**
 *
 * @author Ema
 */
public class Places {

    String Nombre;  //nombre del lugar
    String tipoDeLugar; // bar, restaurante, etc
    String categoria; //romantico por ejemplo
    int categoriaAdquisitiva; //precios
    ArrayList<Places> Lugares;//lista de lugares disponibles

    //constructor
    public Places(String Nombre, String tipoDeLugar, String categoria, int categoriaAdquisitiva) {
        this.Nombre = Nombre;
        this.tipoDeLugar = tipoDeLugar;
        this.categoria = categoria;
        this.categoriaAdquisitiva = categoriaAdquisitiva;
        this.Lugares = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoDeLugar() {
        return tipoDeLugar;
    }

    public void setTipoDeLugar(String tipoDeLugar) {
        this.tipoDeLugar = tipoDeLugar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCategoriaAdquisitiva() {
        return categoriaAdquisitiva;
    }

    public void setCategoriaAdquisitiva(int categoriaAdquisitiva) {
        this.categoriaAdquisitiva = categoriaAdquisitiva;
    }

    public void verLugares() {
        System.out.println("|||||||||||||||||||");
        System.out.println(" lista de Lugares ");

        int i = 0;
        for (Places Lugar : Lugares) {
            System.out.println("lugar " + i + " " + Lugar);
            i++;

        }
    }

    public void mostrarLugaresPorTipo(String tipoDelugares) {
        System.out.println("Tipo: " + tipoDelugares ); //muestra el lugar de la cita.

        for (int i = 0; i < Lugares.size(); i++) {
            Places lugar = Lugares.get(i);
            if (lugar.getTipoDeLugar().equalsIgnoreCase(tipoDelugares)) {
                System.out.println(lugar.getNombre());

            }

        }
    }

}
