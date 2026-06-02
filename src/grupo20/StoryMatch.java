package grupo20;

import java.util.ArrayList; 
import java.util.Date;
import java.util.List;
import grupo10.Single;
import modelo.TarjetaCredito;

public class StoryMatch {
    
   int idMatch;
   Single uno; 
   Single dos; 
   Date fechaInicio;
   Date fechaFin;
   ResultadoMatch resultado;
   int totalPoints;
   int nivelDeAfinidad;
   boolean activo;
   boolean matchExitoso;
   List<Meeting> meetings;
   Feedback feedback;

    public StoryMatch(int idMatch, Date fechaInicio, Date fechaFin, boolean activo) {
        this.idMatch = idMatch;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
        this.meetings = new ArrayList<>();
    }
   
   void agregarMeeting(Meeting meeting){
       meetings.add(meeting);
   }
   
   void finalizarMatch(){
       activo = false;
   }
   
   void calcularTotalPoints(){
     
   }
   
  public void marcarMatchExitoso() {
        this.matchExitoso = true;
    }

   public boolean vencioLaFecha(Date fechaAComparar){
       if(fechaFin.after(fechaAComparar)){
           System.out.println("La fecha todavía no venció");
           return false;
       }else{
           System.out.println("La fecha del vencimiento llegó");
           return true;
       }
   }
   
  public void registrarResultado(Feedback feedback){
       this.feedback = feedback;
   }
   
  public void listarMeetings(){
       for (Meeting meeting : meetings) {
           System.out.println(meeting); 
       }
   }

    public boolean isActivo() {
        return activo;
    }

    public boolean isMatchExitoso() {
        return matchExitoso;
    }

 public void cobrarCrushEncontrado(TarjetaCredito t) {
        // Tarifa plana mensual según el requerimiento 16
        double costoServicio = 11999.0; 

        System.out.println("Procesando cobro por Match Exitoso (Crush Encontrado) - ID Match: " + this.idMatch);
        
        // Primero validamos la tarjeta usando el método que armó Nehuen
        if (t.validarTarjeta()) {
            // Invocamos el método de la tarjeta para impactar el monto
            t.generarCobro(costoServicio);
            System.out.println("Cobro de $" + costoServicio + " acreditado al titular: " + t.getTitular());
            this.matchExitoso = true;
        } else {
            System.out.println("Error en el cobro: La tarjeta de " + t.getTitular() + " es inválida.");
        }
    }
   
    public void cobrarMarchInactivo(TarjetaCredito t) {
        if (this.meetings.isEmpty()) {
            double recargoInactividad = 3000.0; 
            
            System.out.println("Procesando cargo por inactividad - ID Match: " + this.idMatch);
            
            if (t.validarTarjeta()) {
                t.generarCobro(recargoInactividad);
                
                this.activo = false;
                this.feedback = new Feedback();
               this.feedback = new Feedback();
                
                System.out.println("Recargo por inactividad de $" + recargoInactividad + " cobrado a " + t.getTitular());
            } else {
                System.out.println("Error al aplicar recargo: Tarjeta inválida.");
            }
        } else {
            System.out.println("No corresponde cobro por inactividad: El match registra " + meetings.size() + " meetings.");
        }
    }
}
