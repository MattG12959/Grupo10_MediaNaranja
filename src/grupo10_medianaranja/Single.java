/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo10_medianaranja;
import java.util.*
/**
 *
 * @author Usuario
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
    private String contrasenia;
    private String foto;
    private EstadoSingle estado;
    private Date fechaInscripcion;
    private boolean matched;
    private int nroTarjeta;

    public Single() {
    }

    public Single(String dni, String nombreCompleto, String direccion, String localidad, String email, EstadoCivil estadoCivil, int edad, String sexo, boolean tieneHijos, Single crush, String usuario, String contrasenia, String foto, EstadoSingle estado, Date fechaInscripcion, boolean matched, int nroTarjeta) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.localidad = localidad;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
        this.sexo = sexo;
        this.tieneHijos = tieneHijos;
        this.crush = crush;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.foto = foto;
        this.estado = estado;
        this.fechaInscripcion = fechaInscripcion;
        this.matched = matched;
        this.nroTarjeta = nroTarjeta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isTieneHijos() {
        return tieneHijos;
    }

    public void setTieneHijos(boolean tieneHijos) {
        this.tieneHijos = tieneHijos;
    }

    public Single getCrush() {
        return crush;
    }

    public void setCrush(Single crush) {
        this.crush = crush;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public EstadoSingle getEstado() {
        return estado;
    }

    public void setEstado(EstadoSingle estado) {
        this.estado = estado;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    @Override
    public String toString() {
        return "Single{" + "dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", localidad=" + localidad + ", email=" + email + ", estadoCivil=" + estadoCivil + ", edad=" + edad + ", sexo=" + sexo + ", tieneHijos=" + tieneHijos + ", crush=" + crush + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", foto=" + foto + ", estado=" + estado + ", fechaInscripcion=" + fechaInscripcion + ", matched=" + matched + ", nroTarjeta=" + nroTarjeta + '}';
    }

public void registrarse(){

}

public void iniciarSesion(){

}

public void modificarDatos(){

}

public void modificarPerfil(){

}

public void modificarPreferencias(){

}

public void darBajaCrush(){

}

public void darseDeBaja(){

}

public void calcularCuotaMensual(){

}

public void pagarMensualidad(){

}

public void obtenerHistorialMatches(){

}

public void agregarStoryMatch(){

}

public void recibirMail(){

}

public boolean tieneCrush(){
 boolean tieneCrush;
 Single single;
 
    if (!(crush = single)){
    } else {
        tieneCrush = true;
        } 
        return false;
}

}
