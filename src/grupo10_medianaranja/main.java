package grupo10_medianaranja;

import enums.EstadoCivil;
import enums.Nivel;
import grupo10.Prefer;
import grupo10.Profile;
import grupo10.Single;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author matia, Nehuen Zerdá
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // registro e inicio de sesion
        
        System.out.println("Iniciando app...");
        Single single1 = new Single();
        
        single1.setDni("3937392");
        single1.setNombreCompleto("Sergio Rodriguez");
        single1.setDireccion("Calle Siempre Viva 246");
        single1.setLocalidad("San Luis");
        single1.setEmail("sergioro29@gmail.com");
        single1.setUsuario("sergiro29");
        single1.setContrasenia("1234");
        single1.setEstadoCivil(EstadoCivil.SOLTERO);
        single1.setEdad(25);
        
        System.out.println("\nRegistrando single...");
        single1.registrarse();
        
        System.out.println("Iniciando sesion...");
        single1.iniciarSesion(single1.getUsuario(), single1.getContrasenia());
        System.out.println("Bienvenido: "+ single1.getNombreCompleto());
        
        
        // creacion de perfil publico
        Profile perfilSingle1 =  new Profile(
                1.75, 
                78.3,
                "No Tiene", 
                "Marron", 
                Nivel.ALTO, 
                Nivel.MEDIO, 
                Nivel.MEDIO, 
                Nivel.ALTO, 
                Nivel.BAJO, 
                "Entrenar, comer asado", 
                "fotoSergio.jpg");
        single1.modificarPerfil(perfilSingle1);
        
        System.out.println(single1.getProfile().toString());
        
        Prefer preferenciasSingle1 = new Prefer(
                EstadoCivil.SOLTERO,
                20,
                40,
                true,
                Nivel.MEDIO,
                1.40,
                1.70,
                50.0,
                80.0,
                "Castaño",
                "Marron",
                Nivel.ALTO, //nivel carinio
                Nivel.ALTO, // nivel alegria
                Nivel.MEDIO, // nivel companerismo
                Nivel.BAJO, // nivel salidor
                "Salidas, Comidas",
                5,
                3,
                2,
                4,
                2,
                3,
                1,
                1,
                4,
                5,
                3,
                4,
                new Date(),
                true      
        );
        
    
    
    }
    
}
