/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo10_medianaranja;

/**
 *
 * @author Usuario
 */
public class Profile {
    private double estatura;
    private double peso;
    private String colorPelo;
    private String colorOjos;
    private Nivel nivelCultural;
    private Nivel nivelCarinio;
    private Nivel nivelCompanierismo;
    private Nivel nivelAlegria;
    private Nivel nivelSalidor;
    private String aficiones;
    private String fotoPerfil;

    public Profile() {
    }

    public Profile(double estatura, double peso, String colorPelo, String colorOjos, Nivel nivelCultural, Nivel nivelCarinio, Nivel nivelCompanierismo, Nivel nivelAlegria, Nivel nivelSalidor, String aficiones, String fotoPerfil) {
        this.estatura = estatura;
        this.peso = peso;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.nivelCultural = nivelCultural;
        this.nivelCarinio = nivelCarinio;
        this.nivelCompanierismo = nivelCompanierismo;
        this.nivelAlegria = nivelAlegria;
        this.nivelSalidor = nivelSalidor;
        this.aficiones = aficiones;
        this.fotoPerfil = fotoPerfil;
    }

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

    public Nivel getNivelCarinio() {
        return nivelCarinio;
    }

    public void setNivelCarinio(Nivel nivelCarinio) {
        this.nivelCarinio = nivelCarinio;
    }

    public Nivel getNivelCompanierismo() {
        return nivelCompanierismo;
    }

    public void setNivelCompanierismo(Nivel nivelCompanierismo) {
        this.nivelCompanierismo = nivelCompanierismo;
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

    @Override
    public String toString() {
        return "Profile{" + "estatura=" + estatura + ", peso=" + peso + ", colorPelo=" + colorPelo + ", colorOjos=" + colorOjos + ", nivelCultural=" + nivelCultural + ", nivelCarinio=" + nivelCarinio + ", nivelCompanierismo=" + nivelCompanierismo + ", nivelAlegria=" + nivelAlegria + ", nivelSalidor=" + nivelSalidor + ", aficiones=" + aficiones + ", fotoPerfil=" + fotoPerfil + '}';
    }
        
    public void modificarDescripcion(){
    
    }
    public void actualizarFoto(){
    
    }
    
    public void mostrarPerfil(){
    
    }
    
}

