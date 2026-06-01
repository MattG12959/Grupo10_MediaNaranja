package grupo20;

import java.util.ArrayList; 
import java.util.Date;
import java.util.List;
import modelo.Single;

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
   
   void matchExitoso(){
       matchExitoso = true;
   }

   boolean vencioLaFecha(Date fechaAComparar){
       if(fechaFin.after(fechaAComparar)){
           System.out.println("La fecha todavía no venció");
           return false;
       }else{
           System.out.println("La fecha del vencimiento llegó");
           return true;
       }
   }
   
   void registrarResultado(Feedback feedback){
       this.feedback = feedback;
   }
   
   void listarMeetings(){
       for (Meeting meeting : meetings) {
           System.out.println(meeting); 
       }
   }
   
   //getters y setters
}
