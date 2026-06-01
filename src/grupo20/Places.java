/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo20;

/**
 *
 * @author Ema
 */
public class Places {
    String Nombre;  //nombre del lugar
    String tipoDeLugar; // bar, restaurante, etc
    String categoria; //romantico por ejemplo
    int categoriaAdquisitiva; //precios
    
    //constructor
    public Places(String Nombre, String tipoDeLugar, String categoria, int categoriaAdquisitiva) {
        this.Nombre = Nombre;
        this.tipoDeLugar = tipoDeLugar;
        this.categoria = categoria;
        this.categoriaAdquisitiva = categoriaAdquisitiva;
    }
    
    
}
