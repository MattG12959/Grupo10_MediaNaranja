/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enums.ResultadoMatch;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Nehuen
 */
public class StoryMatch {
    private int idMatch;
    private Date fechaInicio;
    private Date fechaFin;

    private ResultadoMatch resultado;

    private int totalPoints;
    private int nivelAfinidad;

    private boolean activo;

    private Single single1;
    private Single single2;

    private ArrayList<Meeting> meetings;

    // Constructor
    public StoryMatch(int idMatch,
                      Date fechaInicio,
                      Date fechaFin,
                      int nivelAfinidad,
                      Single single1,
                      Single single2) {

        this.idMatch = idMatch;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nivelAfinidad = nivelAfinidad;

        this.single1 = single1;
        this.single2 = single2;

        this.totalPoints = 0;
        this.activo = true;

        this.meetings = new ArrayList<>();
    }

    // Métodos
    public void agregarMeeting(Meeting meeting) {

        if (meetings.size() < 5) {

            meetings.add(meeting);

            calcularTotalPoints();

            System.out.println("Meeting agregado.");

        } else {

            System.out.println("No se pueden agregar más meetings.");
        }
    }

    public void calcularTotalPoints() {

        totalPoints = 0;

        ArrayList<String> lugaresDistintos = new ArrayList<>();

        for (Meeting m : meetings) {

            totalPoints += m.getPointsEarned();

            String nombreLugar = m.getLugar().getNombre();

            if (!lugaresDistintos.contains(nombreLugar)) {

                lugaresDistintos.add(nombreLugar);
            }
        }

        totalPoints += lugaresDistintos.size() * 5;
    }

    public boolean esMatchExitoso() {

        return totalPoints >= 80;
    }

    public void finalizarMatch() {

        activo = false;

        if (esMatchExitoso()) {

            resultado = ResultadoMatch.MATCH;

            single1.setCrush(single2);
            single2.setCrush(single1);

        } else {

            resultado = ResultadoMatch.UNMATCH;
        }

        System.out.println("Match finalizado.");
    }

    public void verificarVencimiento() {

        Date hoy = new Date();

        if (hoy.after(fechaFin)) {

            finalizarMatch();
        }
    }

    public void registrarResultado() {

        System.out.println("Resultado: " + resultado);
        System.out.println("Total Points: " + totalPoints);
    }

    public void listarMeetings() {

        for (Meeting m : meetings) {

            m.mostrarDetalle();
            System.out.println("----------------");
        }
    }

    // Getters
    public int getTotalPoints() {
        return totalPoints;
    }

    public ResultadoMatch getResultado() {
        return resultado;
    }

    public boolean isActivo() {
        return activo;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }
}
