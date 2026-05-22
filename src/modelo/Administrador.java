/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import enums.EstadoSingle;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Nehuen
 */
public class Administrador {
    private int idAdmin;
    private String nombre;
    private String email;

    // Constructor
    public Administrador(int idAdmin, String nombre, String email) {

        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.email = email;
    }

    // Métodos
    public StoryMatch generarEmparejamiento(Single s1, Single s2) {

        int afinidad = calcularAfinidad(s1, s2);

        Date inicio = new Date();

        // 30 días aprox
        Date fin = new Date(inicio.getTime() + (30L * 24 * 60 * 60 * 1000));

        StoryMatch match = new StoryMatch(
                (int)(Math.random() * 1000),
                inicio,
                fin,
                afinidad,
                s1,
                s2
        );

        s1.agregarStoryMatch(match);
        s2.agregarStoryMatch(match);

        registrarMatch(s1, s2);

        return match;
    }

    public StoryMatch seleccionarParejaManual(Single s1,
                                              Single s2,
                                              int afinidadManual) {

        Date inicio = new Date();

        Date fin = new Date(inicio.getTime() + (30L * 24 * 60 * 60 * 1000));

        StoryMatch match = new StoryMatch(
                (int)(Math.random() * 1000),
                inicio,
                fin,
                afinidadManual,
                s1,
                s2
        );

        s1.agregarStoryMatch(match);
        s2.agregarStoryMatch(match);

        return match;
    }

    public int calcularAfinidad(Single s1, Single s2) {

        int afinidad1 = s1.getPreferActual()
                          .calcularAfinidad(s2.getProfile(), s2);

        int afinidad2 = s2.getPreferActual()
                          .calcularAfinidad(s1.getProfile(), s1);

        return (afinidad1 + afinidad2) / 2;
    }

    public void enviarMailEmparejamiento(Single s1, Single s2) {

        String mensaje = "Nuevo emparejamiento generado.";

        s1.recibirMail(mensaje);
        s2.recibirMail(mensaje);
    }

    public void verificarCitasVencidas(ArrayList<StoryMatch> matches) {

        for (StoryMatch match : matches) {

            match.verificarVencimiento();
        }
    }

    public void registrarMatch(Single s1, Single s2) {

        System.out.println("Nuevo Match:");
        System.out.println(s1.getNombreCompleto()
                + " ❤️ "
                + s2.getNombreCompleto());
    }

    public void registrarUnmatch(Single s1, Single s2) {

        System.out.println("UnMatch registrado.");
    }

    public void generarEstadisticas(ArrayList<Single> singles,
                                    ArrayList<StoryMatch> matches) {

        int totalSingles = singles.size();

        int totalMatches = 0;
        int totalUnmatches = 0;

        for (StoryMatch match : matches) {

            if (!match.isActivo()) {

                if (match.esMatchExitoso()) {
                    totalMatches++;
                } else {
                    totalUnmatches++;
                }
            }
        }

        System.out.println("=== ESTADISTICAS ===");
        System.out.println("Singles: " + totalSingles);
        System.out.println("Matches: " + totalMatches);
        System.out.println("UnMatches: " + totalUnmatches);
    }
}
