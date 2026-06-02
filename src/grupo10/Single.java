/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo10;

import java.util.*;
import enums.EstadoCivil;
import enums.EstadoSingle;
import modelo.Pago;
import grupo10.Prefer;
import grupo20.StoryMatch;
import modelo.TarjetaCredito;

/**
 *
 * @author Antonacci Matías, Dave Natalia, Zerdán Nehuen
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
    private Profile perfil;
    private List<Prefer> preferencias;
    private TarjetaCredito tarjetaCredito;
    private List<Pago> pagos;
    private List<StoryMatch> historiaMatches;

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

    public Single(Profile perfil, List<Prefer> preferencias, TarjetaCredito tarjetaCredito, List<Pago> pagos, List<StoryMatch> historiaMatches) {
        this.perfil = perfil;
        this.preferencias = preferencias;
        this.tarjetaCredito = tarjetaCredito;
        this.pagos = pagos;
        this.historiaMatches = historiaMatches;
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

    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    public List<Prefer> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<Prefer> preferencias) {
        this.preferencias = preferencias;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public List<StoryMatch> getHistoriaMatches() {
        return historiaMatches;
    }

    public void setHistoriaMatches(List<StoryMatch> historiaMatches) {
        this.historiaMatches = historiaMatches;
    }

    @Override
    public String toString() {
        return "Single{" + "dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", localidad=" + localidad + ", email=" + email + ", estadoCivil=" + estadoCivil + ", edad=" + edad + ", sexo=" + sexo + ", tieneHijos=" + tieneHijos + ", crush=" + crush + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", foto=" + foto + ", estado=" + estado + ", fechaInscripcion=" + fechaInscripcion + ", matched=" + matched + ", nroTarjeta=" + nroTarjeta + '}';
    }

    public void registrarse() {
        this.fechaInscripcion = new Date();
        this.estado = EstadoSingle.SINGLE;
        System.out.println("Single registrado: " + nombreCompleto);

    }

    public boolean iniciarSesion(String usuario, String contrasenia) {

        return this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia);
    }

    public void modificarDatos(String nombreCompleto, String direccion, String localidad, String email) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.localidad = localidad;
        this.email = email;
    }

    public void modificarPerfil(Profile nuevoPerfil) {
        this.perfil = nuevoPerfil;
    }

    public void modificarPreferencias(Prefer nuevaPreferencia) {
        if (preferencias == null) {
            preferencias = new ArrayList<>();
        }
        preferencias.add(nuevaPreferencia);

    }

    public void darBajaCrush() {
        this.crush = null;

    }

    public void darseDeBaja() {
        this.estado = EstadoSingle.INACTIVO;

    }

    public double calcularCuotaMensual() {
        double cuota = 5000.00; 
    
    return cuota; 

    }

    public Pago pagarMensualidad() {
        double monto = calcularCuotaMensual();


        int id = 1;
        String descripcion = "Mensualidad - " + nombreCompleto;
        Date fecha = new Date();

        Pago pago = new Pago(id, monto, fecha, descripcion);

        if (tarjetaCredito != null && tarjetaCredito.realizarPago(pago)) {
            pagos.add(pago);
            return pago;
        }

        return null;
    }

    public List<StoryMatch> obtenerHistorialMatches() {
        return historiaMatches;

    }

    public void agregarStoryMatch(StoryMatch match) {
        historiaMatches.add(match);
        this.matched = true;
        this.estado = EstadoSingle.MATCHED;

    }

    public void recibirMail(String asunto, String mensaje) {
        System.out.println("Mail enviado a " + email);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);

    }

    public boolean tieneCrush() {
        return crush != null;
    }

    public Prefer getPreferActual() {
        if (preferencias == null || preferencias.isEmpty()) {
            return null;
        }
        // Retorna la preferencia activa, o la última si ninguna está activa
        for (Prefer p : preferencias) {
            if (p.isActiva()) {
                return p;
            }
        }
        return preferencias.get(preferencias.size() - 1);
    }

    public Profile getProfile() {
        return perfil;
    }

}

