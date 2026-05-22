/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enums.Nivel;
/**
 *
 * @author Nehuen
 */
public class Profile {
    private double estatura;
    private double peso;
    private String colorPelo;
    private String colorOjos;

    private Nivel nivelCultural;
    private Nivel nivelCariño;
    private Nivel nivelCompañerismo;
    private Nivel nivelAlegria;
    private Nivel nivelSalidor;

    private String aficiones;
    private String fotoPerfil;

    // Constructor
    public Profile(double estatura, double peso, String colorPelo,
                   String colorOjos, Nivel nivelCultural,
                   Nivel nivelCariño, Nivel nivelCompañerismo,
                   Nivel nivelAlegria, Nivel nivelSalidor,
                   String aficiones, String fotoPerfil) {

        this.estatura = estatura;
        this.peso = peso;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.nivelCultural = nivelCultural;
        this.nivelCariño = nivelCariño;
        this.nivelCompañerismo = nivelCompañerismo;
        this.nivelAlegria = nivelAlegria;
        this.nivelSalidor = nivelSalidor;
        this.aficiones = aficiones;
        this.fotoPerfil = fotoPerfil;
    }

    // Getters y Setters
    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Nivel getNivelCultural() {
        return nivelCultural;
    }

    public void setNivelCultural(Nivel nivelCultural) {
        this.nivelCultural = nivelCultural;
    }

    public Nivel getNivelCariño() {
        return nivelCariño;
    }

    public void setNivelCariño(Nivel nivelCariño) {
        this.nivelCariño = nivelCariño;
    }

    public Nivel getNivelCompañerismo() {
        return nivelCompañerismo;
    }

    public void setNivelCompañerismo(Nivel nivelCompañerismo) {
        this.nivelCompañerismo = nivelCompañerismo;
    }

    public Nivel getNivelAlegria() {
        return nivelAlegria;
    }

    public void setNivelAlegria(Nivel nivelAlegria) {
        this.nivelAlegria = nivelAlegria;
    }

    public Nivel getNivelSalidor() {
        return nivelSalidor;
    }

    public void setNivelSalidor(Nivel nivelSalidor) {
        this.nivelSalidor = nivelSalidor;
    }

    public String getAficiones() {
        return aficiones;
    }

    public void setAficiones(String aficiones) {
        this.aficiones = aficiones;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    // Métodos
    public void modificarDescripcion(String nuevasAficiones) {

        this.aficiones = nuevasAficiones;

        System.out.println("Descripción modificada.");
    }

    public void actualizarFoto(String nuevaFoto) {

        this.fotoPerfil = nuevaFoto;

        System.out.println("Foto actualizada.");
    }

    public void mostrarPerfil() {

        System.out.println("=== PERFIL ===");
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
        System.out.println("Pelo: " + colorPelo);
        System.out.println("Ojos: " + colorOjos);
        System.out.println("Aficiones: " + aficiones);
    }
}
